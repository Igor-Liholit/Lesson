package Coffee.order;

    public class Order {
        private final int number;
        private final String nameClient;

        public Order(int number, String nameClient) {
            this.number = number;
            this.nameClient = nameClient;
        }

        public int getNumber() {
            return number;
        }

        @Override
        public String toString() {
            return "  " + number + "  | " + nameClient + "\n";
        }
    }


