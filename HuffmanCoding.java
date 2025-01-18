import java.util.PriorityQueue;
import java.util.HashMap;
import java.util.Map;

class HuffmanNode {
    char character;
    int frequency;
    HuffmanNode left, right;

    HuffmanNode(char character, int frequency) {
        this.character = character;
        this.frequency = frequency;
        this.left = null;
        this.right = null;
    }
}

public class HuffmanCoding {

    // Build the Huffman Tree
    public static HuffmanNode buildTree(Map<Character, Integer> freqMap) {
        PriorityQueue<HuffmanNode> pq = new PriorityQueue<>((a, b) -> a.frequency - b.frequency);

        // Add all characters to the priority queue
        for (Map.Entry<Character, Integer> entry : freqMap.entrySet()) {
            pq.add(new HuffmanNode(entry.getKey(), entry.getValue()));
        }

        // Combine nodes until one node remains
        while (pq.size() > 1) {
            HuffmanNode left = pq.poll();
            HuffmanNode right = pq.poll();
            HuffmanNode newNode = new HuffmanNode('\0', left.frequency + right.frequency);
            newNode.left = left;
            newNode.right = right;
            pq.add(newNode);
        }

        return pq.poll(); // Root of the tree
    }

    // Generate Huffman Codes
    public static void generateCodes(HuffmanNode root, String code, Map<Character, String> huffmanCode) {
        if (root == null) return;

        if (root.left == null && root.right == null) {
            huffmanCode.put(root.character, code);
        }

        generateCodes(root.left, code + "0", huffmanCode);
        generateCodes(root.right, code + "1", huffmanCode);
    }

    // Compress the input string
    public static String compress(String text, Map<Character, String> huffmanCode) {
        StringBuilder encodedText = new StringBuilder();
        for (char ch : text.toCharArray()) {
            encodedText.append(huffmanCode.get(ch));
        }
        return encodedText.toString();
    }

    // Decompress the encoded string
    public static String decompress(String encodedText, HuffmanNode root) {
        StringBuilder decodedText = new StringBuilder();
        HuffmanNode current = root;

        for (char bit : encodedText.toCharArray()) {
            current = (bit == '0') ? current.left : current.right;

            if (current.left == null && current.right == null) {
                decodedText.append(current.character);
                current = root;
            }
        }

        return decodedText.toString();
    }

    public static void main(String[] args) {
        String text = "huffman coding example";

        // Step 1: Calculate frequency of each character
        Map<Character, Integer> freqMap = new HashMap<>();
        for (char ch : text.toCharArray()) {
            freqMap.put(ch, freqMap.getOrDefault(ch, 0) + 1);
        }

        // Step 2: Build the Huffman Tree
        HuffmanNode root = buildTree(freqMap);

        // Step 3: Generate Huffman Codes
        Map<Character, String> huffmanCode = new HashMap<>();
        generateCodes(root, "", huffmanCode);

        System.out.println("Huffman Codes: " + huffmanCode);

        // Step 4: Compress the string
        String encodedText = compress(text, huffmanCode);
        System.out.println("Encoded Text: " + encodedText);

        // Step 5: Decompress the string
        String decodedText = decompress(encodedText, root);
        System.out.println("Decoded Text: " + decodedText);
    }
}
