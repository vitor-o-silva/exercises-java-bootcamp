package model;

public class Main {
    public static void main(String[] args) {
        Veiculo fordFiesta = new Veiculo("Fiesta","Ford",1000);
        Veiculo fordFocus = new Veiculo("Focus","Ford",1200);
        Veiculo fordExplorer= new Veiculo("Explorer","Ford",2500);

        Veiculo fiatUno = new Veiculo("Uno","Fiat",500);
        Veiculo fiatCronos = new Veiculo("Cronos","Fiat",1000);
        Veiculo fiatTorino= new Veiculo("Torino","Fiat",1250);

        Veiculo chevroletAveo = new Veiculo("Aveo","Chevrolet",1250);
        Veiculo cgevroletSpin = new Veiculo("Spin","Chevrolet",2500);

        Veiculo toyotaCorola = new Veiculo("Corola","Toyota",1200);
        Veiculo toyotaFortuner = new Veiculo("Fortuner","Toyota",3000);

        Veiculo renaultLogan = new Veiculo("Logan","Renault",950);

        Garagem garagem = new Garagem(1);
        garagem.addVeiculo(fordFiesta);
        garagem.addVeiculo(fordFocus);
        garagem.addVeiculo(fordExplorer);
        garagem.addVeiculo(fiatUno);
        garagem.addVeiculo(fiatCronos);
        garagem.addVeiculo(fiatTorino);
        garagem.addVeiculo(chevroletAveo);
        garagem.addVeiculo(cgevroletSpin);
        garagem.addVeiculo(toyotaCorola);
        garagem.addVeiculo(toyotaFortuner);
        garagem.addVeiculo(renaultLogan);

        System.out.println(garagem.ordenaPreco());
        System.out.println(garagem.ordenaMarca());
        System.out.println(garagem.filtrarMenoresPrecos());
        System.out.println(garagem.filtrarMaioresPrecos());
        System.out.println(garagem.precoMedio());



    }
}
