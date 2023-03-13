public class Impostos{

  public void icmsNormal(double valor, double aliquota){
    
    aliquota = aliquota/100;
    double total = (valor*aliquota);

    System.out.println("Valor dos produtos: R$ "+valor);
    System.out.println("Alíquota de ICMS "+aliquota*100+"%.");
    System.out.printf("Valor do ICMS Normal: %.2f %n ",total);
    
  }

  public void icmsAntParcial(double valor, double aliquota){
    
    aliquota = aliquota/100;
    double total = (valor*aliquota);

    System.out.println("Valor dos produtos: R$ "+valor);
    System.out.println("Alíquota de ICMS "+aliquota*100+"%.");
    System.out.printf("Valor do ICMS Normal: %.2f %n ",total);
    
  }
 
}