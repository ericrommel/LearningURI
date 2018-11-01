package generateTCs.test;

public class ExemploListaCircular {
	public static void main(String[] args) {  
		  
        int tamanho = 5;  
        Object[] lista = new Object[5];  
        imprimeArray(lista);  
  
        int indice = 0;  
  
  
        for (int i = 0; i < 100; i++) {  
            lista[indice] = Integer.valueOf(i);  
  
            // calcular proximo indice  
            indice = (indice + 1) % tamanho;  
  
            imprimeArray(lista);  
        }  
    }  
  
    private static void imprimeArray(Object[] array) {  
        StringBuffer buffer = new StringBuffer();  
        for (int i = 0, size = array.length; i < size; i++) {  
            if (i > 0) {  
                buffer.append("-");  
            }  
            buffer.append("[ " + array[i] + " ]");  
        }  
        System.out.println(buffer);  
    }  
}
