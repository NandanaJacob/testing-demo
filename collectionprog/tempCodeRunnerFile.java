 // @Override
    // public boolean equals(Object obj) {
    //     if (this == obj) return true; // Reference equality
    //     if (obj == null || getClass() != obj.getClass()) return false; // Type check
    //     Person person = (Person) obj;
    //     return age == person.age && name.equals(person.name); // Logical equality
    // }

    // // Override hashCode to ensure consistent hashing
    // @Override
    // public int hashCode() {
    //     int result = Integer.hashCode(age);
    //     result = 31 * result + name.hashCode();
    //     return result;
    // }