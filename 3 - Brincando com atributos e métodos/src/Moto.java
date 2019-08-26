public class Moto {
        int qtdPass;
        int qtdPassMax = 2;
        int qtdGas;
        int qtdGasMax = 10;
        boolean estaLigada;

        void ligar() {
            if (qtdPass == 0) {
                System.out.println("Não há ninguém na moto!");
                return;
            }
            if (estaLigada) {
                System.out.println("Já está ligada!");
                return;
            }
            estaLigada = true;
            System.out.println("Ligando a moto...");
        }

        void desligar() {
            if (qtdPass == 0) {
                System.out.println("Não há ninguém na moto!");
                return;
            }
            if (!estaLigada) {
                System.out.println("Já está desligada!");
                return;
            }
            estaLigada = false;
            System.out.println("Desligando a moto...");
        }

        void montar() {
            if (qtdPass == qtdPassMax) {
                System.out.println("Moto lotada.");
            } else {
                qtdPass += 1;
                System.out.println("Subindo na moto...");
            }
        }

        void descer() {
            if (qtdPass > 0) {
                qtdPass -= 1;
                System.out.println("Descendo da moto...");
            } else {
                System.out.println("Moto vazia!");
            }
        }

        void andar() {
            if (!estaLigada && qtdPass < 0) {
                qtdGas -= 1;
                System.out.println("Andando 1km...");

            } else {
                System.out.println("A moto está deligada!");
            }
            estaLigada = false;
        }

        void abastecer() {
            if (qtdGas == qtdGasMax) {
                System.out.println("O tanque já está cheio!");
            } else {
                qtdGas += 1;
                System.out.println("+1L");
            }
        }

        void status() {
            System.out.println("Ligado: " + estaLigada +
                    ", Quantidade de passageiros: " + qtdPass +
                    ", Gasolina: " + qtdGas);
        }


    }
