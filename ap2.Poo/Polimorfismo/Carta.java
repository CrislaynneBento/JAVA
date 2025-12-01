    package ap2.Polimorfismo;

    public class Carta extends Encomenda implements Rastreavel{
        private boolean urgente;

        public Carta(String codigo, double peso, boolean urgente){
            super(codigo, peso);
            this.urgente = urgente;
        }

        @Override
        public double calcularCustoEnvio() {
            double resultado = peso * 5.0;
            if(urgente){
                resultado = resultado * 1.20;
            }
            return resultado;
        }

        @Override
        public String getStatus() {
            if(urgente){
                return "Em trânsito urgente";
            } else {
                return "Aguardando classificação";
            }
        }

        
        
    }
