package bar.gtfo.sospring.service;

import bar.gtfo.sospring.repository.TestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TestService implements CrudService {

    private TestRepository repository;

    public TestService(@Autowired TestRepository repository) {
        this.repository = repository;
    }

    @Override
    public List list() {
        return repository.findAll();
    }

    @Override
    public Object create(Object o) {
        return null;
    }

    @Override
    public Optional get(int id) {
        return Optional.empty();
    }

    @Override
    public void update(Object o, int id) {

    }

    @Override
    public void delete(int id) {

    }
}
