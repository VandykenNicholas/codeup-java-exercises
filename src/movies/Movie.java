package movies;



public class Movie {

    private String name;
    private String catagory;

        public Movie(String name, String category){
            this.name = name;
            this.catagory = category;
        }

        public String getName(){
            return name;
        }

        public String getCategory(){
            return catagory;
        }

    @Override
        public String toString() {
            return "Title: \" "+ name+" \" , The category is: \" "+ catagory+ " \" ";
        }
    }

