package globalTemp;

public class GlobalTemp {
    public static void main(String[] args) {
        String[] city = {"Londres", "Madrid", "Nueva York", "Buenos Aires", "Asunción", "São Paulo", "Lima", "Santiago de Chile", "Lisboa", "Tokio"};
        int[][] temp = new int[10][2];
        temp[0][0] = -2;
        temp[0][1] = 33;
        temp[1][0] = -3;
        temp[1][1] = 32;
        temp[2][0] = -8;
        temp[2][1] = 27;
        temp[3][0] = 4;
        temp[3][1] = 37;
        temp[4][0] = -6;
        temp[4][1] = 42;
        temp[5][0] = 5;
        temp[5][1] = 43;
        temp[6][0] = 0;
        temp[6][1] = 39;
        temp[7][0] = -7;
        temp[7][1] = 26;
        temp[8][0] = -1;
        temp[8][1] = 31;
        temp[9][0] = -10;
        temp[9][1] = 35;

        int min = temp[0][0];
        int max = temp[0][1];
        int positionMinTemp = 0;
        int positionMaxTemp = 0;

        for (int i = 0; i < 10; i += 1) {
            for (int j = 0; j < 2; j++) {
                int valueTemp = temp[i][j];
                if (min > valueTemp) {
                    min = valueTemp;
                    positionMinTemp = i;
                }
                if (max < valueTemp) {
                    max = valueTemp;
                    positionMaxTemp = i;
                }
            }
        }

        System.out.println("Temperatura Minima: cidade "+ city[positionMinTemp] + " temperatura: " + min);
        System.out.println("Temperatura Maxima: cidade "+ city[positionMaxTemp] + " temperatura: " + max);
    }
}

