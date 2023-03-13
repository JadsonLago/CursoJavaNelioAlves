import java.util.Scanner;
class Main {
  public static void main(String[] args){
    double valor, aliquota;          
    Scanner sc = new Scanner (System.in);

    System.out.println("Informe o valor dos produtos");
    valor = sc.nextDouble();

    System.out.println("Qual a alíquota de ICMS?");
    aliquota = sc.nextDouble();

    Impostos objIcms = new Impostos();
    objIcms.icmsNormal(valor, aliquota);
           
    sc.close();
  }

/*@Override
public String toString() {
	return "Main []";
}*/
}