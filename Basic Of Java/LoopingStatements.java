class LoopingStatements {
    public static void main(String[] args) {
        for (int i = 1; i <= 3; i++) {
            System.out.println("Hello i = "+i);
            for (int j = 1; j <= 3; j++) {
                System.out.println("Hey j = "+j);
            }
        }
    }
}
