package ch14;

public class Main {
    public static void main(String[] args) {
        String hi ="anna";
        String s2 = "";
        String s3 = "kkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkk";
        int n = 5;
        int n2 = 15;

        StackManager.push("j");
        StackManager.push("k");
        StackManager.traverseStack();

        System.out.println("Popped: " + StackManager.pop());

        StackManager.traverseStack();

//
//        System.out.println(ValidationUtils.isOneTo31(hi));
//        System.out.println(ValidationUtils.isOneTo31(s3));
//        System.out.println(ValidationUtils.isBetween1and10(n2));

    }
}
