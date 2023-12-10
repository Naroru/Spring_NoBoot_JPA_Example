package MyPackage;


import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class CatService {

    private final Cat_DAO  cat_dao;

    public CatService(Cat_DAO cat_dao) {
        this.cat_dao = cat_dao;
    }


    public  void saveCat(Cat_Entity cat)
    {

        cat_dao.save(cat);
    }
}
