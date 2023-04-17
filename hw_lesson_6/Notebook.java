package HW_JAVA.hw_lesson_6;

public class Notebook {
        public String brand;
        public String model;
        public int ram;
        public int storage;
        public String os;
        public String colour;
        public int price;
        /**
         * Класс ноутбук. 
         * @param brand производитель ноутбука
         * @param model модель ноутбука
         * @param ram   объем ОЗУ 
         * @param storage   размер хранилища
         * @param os    операционная система
         * @param colour основной цвет  
         * @param price    цена ноутбука
         */
        public Notebook(String brand, String model, int ram, int storage, String os, String colour, int price){
            this.brand = brand.toUpperCase();
            this.model = model.toUpperCase();
            this.ram = ram;
            this.storage = storage;
            this.os = os.toUpperCase();
            this.colour = colour.toUpperCase();
            this.price = price;
            
        }    
        /**
         * гет Метод, позволяющий определить производителя ноутбука
         * @return возвращает марку ноутбука
         */
        public String getBrand() {
            return brand;
        }

        /**
         * гет метод, позволяющий определить модель ноутбука
         * @return возвращает модель ноутбука
         */
        public String getModel(){
            return model;
        }

        /**
         * гет метод, для получения информации об объеме ОЗУ ноутбука
         * @return возвращает Объем установленной ОЗУ
         */
        public int getRam(){
            return ram;
        }

        /**
         * гет метод для получения информации об объеме Постоянной памяти (HDD or SSD)
         * @return возвращает объем ПЗУ
         */
        public int getStorage(){
            return storage;
        }
        
        /**
         * гет метод для получения информации об установленной ОС
         * @return возвращает тип ОС
         */
        public String getOStype(){
            return os;
        }

        /**
         * гет метод для получения информации об основном цвете ноутбука
         * @return возвращает основной цвет ноутбука
         */
        public String getColour(){
            return colour;
        }
        
        /**
         * гет метод для получения информации о стоимости ноутбука
         * @return возвращает стоимость ноубтука
         */
        public int getPrice(){
            return price;
        }
        
    
}
