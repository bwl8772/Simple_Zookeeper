class Sandbox {

    public static void main(String[] args) {
        String myString = "Hello, User!";
        char myChar = myString.charAt(7);
        String output = String.valueOf(myChar);
        String output2 = myString.substring(output);
        System.out.println(output);
    }


}