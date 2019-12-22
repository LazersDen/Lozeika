package RAINENI;
public class POST {
        String strit;
        String tip;
        int plochad;
        int id;
        int nomber;
        int Etach;
        int Komnata;
        int Crok;
        public POST() {
        }
        public POST( int id, int nomber, int plochad, int Etach, int Komnata, String strit, String tip, int Crok) {
            this.nomber = nomber;
            this.id = id;
            this.tip=tip;
            this.Etach=Etach;
            this.Komnata=Komnata;
            this.plochad=plochad;
            this.strit=strit;
            this.Crok=Crok;
        }
        public void Info() {
            System.out.println(" ID :"+this.id+" Номер Квартиры :"+this.nomber+" Площадь Квартиры :"+this.plochad+" Этаж :"+this.Etach+" Комнаты :"+this.Komnata+" Улица :"+this.strit+" Тип Здания :"+this.tip+" Срок Эксплотациии :"+this.Crok);
        }
    }
