package bar.gtfo.sospring.repository;

import bar.gtfo.sospring.model.Test;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class TestRepository implements CrudRepository<Test> {

    @Override
    public List<Test> findAll() {
        List<Test> tests = new ArrayList<Test>();
        Test zhvotne = new Test(
                1,
                "КАКОИ ЖВОТНЕ ВЫ КУСАИТИ?",
                "УЗНАЙТИ КАКОИ ЖВОТНЕ ВЫ ДОСТОЙНЫ КУСАТ"
        );
        tests.add(zhvotne);
        return tests;
    }
}
