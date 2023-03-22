class Weihnachtsbaum {
    public static void main(String[] args) {
        
        int height = 10; 
        int width = 21; 
        
        for (int row = 0; row < height; row++) {
            for (int col = 0; col < width; col++) {
                if (col == width / 2 || col >= width / 2 - row && col <= width / 2 + row) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        
        for (int i = 0; i < height / 4; i++) {
            for (int j = 0; j < width / 2 - 1; j++) {
                System.out.print(" ");
            }
            System.out.println("***");
        }
    }
}

