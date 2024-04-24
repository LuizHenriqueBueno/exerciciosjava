package modelo;

public class Validacao extends AbsPropriedades
{

    public Validacao(String lado1, String lado2, String lado3)
    {
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
        this.Executar();
    }
    
    private void Executar()
    {
        this.mensagem = "";
        try
        {
            this.l1 = Double.parseDouble(lado1);
            this.l2 = Double.parseDouble(lado2);
            this.l3 = Double.parseDouble(lado3);
            
            if(l1 + l2 <= l3 || l1 + l3 <= l2 || l2 + l3 <= l1)
            {
                this.mensagem = "Não é um triangulo";
            }
        }
        
        catch (Exception e)
        {
            this.mensagem = "Numeros invalidos";
        }
    }
    
}
