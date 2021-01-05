class Main{
    //9×9マス作る
    public static void main(String[] args) {
        System.out.println("  a b c d e f g h i");
        for (int j=0; j<9; j++){
            System.out.print(j+" ");
            for (int i=0; i<9; i++){
                System.out.print("□ ");
            }
            System.out.println("");
        }
    }
}
