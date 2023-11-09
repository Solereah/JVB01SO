public class Main {
    public static void main(String[] args) {
    int [] numerosLoteria = new int[6];

        try{
            for (int i=0; i< numerosLoteria.length;i++) {
                numerosLoteria[i] =(int) (Math.random()*100);
            }
            System.out.println(numerosLoteria[6]);;
        }catch(Exception e){
            System.out.println("Error: Está intentando acceder a una posición del vector que está fuera de rango.");
        }

    }
}