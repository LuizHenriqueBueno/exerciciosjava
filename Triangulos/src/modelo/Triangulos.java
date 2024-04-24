package modelo;

public class Triangulos extends AbsPropriedades
{

    public Triangulos(Double l1, Double l2, Double l3)
    {
        this.l1 = l1;
        this.l2 = l2;
        this.l3 = l3;
        this.Executar();
    }
    
    private void Executar()
    {
        if(l1.equals(l2) && l2.equals(l3))
            this.resposta = "Triangulo Equilatero";
        else
            if(!l1.equals(l2) && !l2.equals(l3) && !l1.equals(l3))
                this.resposta = "Triangulo Esoleno";
            else
                this.resposta = "Triangulo Isosceles";
    }
}
