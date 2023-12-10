import MyPackage.CatService;
import MyPackage.Cat_DAO;
import MyPackage.Cat_Entity;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {

                try(AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(JPAConfiguration.class)) {
                   /* Cat_DAO dao = context.getBean("catDAO", Cat_DAO.class);
                    dao.save(new Cat_Entity("Pushok"));*/
                    CatService dao = context.getBean("catService", CatService.class);
                    dao.saveCat(new Cat_Entity("Pushok"));


                }

    }
}
