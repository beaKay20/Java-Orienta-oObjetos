package orientacaoObjeto;

public class Triangulo {
         double ladoA;
         double ladoB;
         double ladoC;


        public Triangulo(double ladoA, double ladoB, double ladoC) {
            this.ladoA = ladoA;
            this.ladoB = ladoB;
            this.ladoC = ladoC;
        }


        public boolean ehTriangulo() {
            return (ladoA + ladoB > ladoC) && (ladoA + ladoC > ladoB) && (ladoB + ladoC > ladoA);
        }

        public double calcularArea() {
            if (ehTriangulo()) {
                double s = (ladoA + ladoB + ladoC) / 2;
                return Math.sqrt(s * (s - ladoA) * (s - ladoB) * (s - ladoC));
            } else {
                System.out.println("Não é possível calcular a área. Não é um triângulo válido.");
                return -1;
            }
        }


        public boolean ehEquilatero() {
            return ehTriangulo() && (ladoA == ladoB) && (ladoB == ladoC);
        }

        public boolean ehIsosceles() {
            return ehTriangulo() && ((ladoA == ladoB) || (ladoA == ladoC) || (ladoB == ladoC));
        }

        public boolean ehEscaleno() {
            return ehTriangulo() && (ladoA != ladoB) && (ladoA != ladoC) && (ladoB != ladoC);
        }

        public static void main(String[] args) {
            Triangulo meuTriangulo = new Triangulo(3.0, 4.0, 5.0);
            if (meuTriangulo.ehTriangulo()) {
                System.out.println("Área do triângulo: " + meuTriangulo.calcularArea());
                if (meuTriangulo.ehEquilatero()) {
                    System.out.println("É um triângulo equilátero.");
                } else if (meuTriangulo.ehIsosceles()) {
                    System.out.println("É um triângulo isósceles.");
                } else if (meuTriangulo.ehEscaleno()) {
                    System.out.println("É um triângulo escaleno.");
                }
            } else {
                System.out.println("Não é um triângulo válido.");
            }
        }
    }



