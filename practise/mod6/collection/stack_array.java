package practise.mod6.collection;

import java.util.Arrays;

public class stack_array {
    static int[] arr = new int[10];
    static int insert_index_odd = 1;
    static int insert_index_even = 0;
    //pushes data into indexes 1, 3, 5, 7, ...
    static void push1(int data){
        arr[insert_index_odd] = data;
        System.out.println("inserted " + data + " into odd index " + insert_index_odd);
        insert_index_odd = insert_index_odd + 2;
    }
    static void push2(int data){
        arr[insert_index_even] = data;
        System.out.println("inserted " + data + " into even index " + insert_index_even);
        insert_index_even = insert_index_even + 2;
    }
    static void pop1(){
        int pop_odd_i = insert_index_odd - 2;
        System.out.println("popped " + arr[pop_odd_i] + " at index " + pop_odd_i);
        arr[pop_odd_i] = 0;
        insert_index_odd = pop_odd_i;
    }
    static void pop2(){
        int pop_even_i = insert_index_even - 2;
        System.out.println("popped " + arr[pop_even_i] + " at index " + pop_even_i);
        arr[pop_even_i] = 0;
        insert_index_odd = pop_even_i;
    }
    static void printArray() {
        System.out.println("Current stack: " + Arrays.toString(arr));
    }
    public static void main(String[] args) {
        stack_array arr = new stack_array();
        arr.push1(10);
        arr.push2(20);
        arr.push1(30);
        arr.push2(40);
        printArray();
        pop1();
        pop2();
        printArray();
    }
}
