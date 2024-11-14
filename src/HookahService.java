import java.util.List;
import java.util.Scanner;

public class HookahService {

    public HookahRepository hookahRepository = new HookahRepository();

    public void createHookah(String fortress, String taste) {
        if (fortress.length() <= 0) {
            System.out.println("Fortress length must be greater than 0");
            return;
        }
        if (taste.length() <= 0) {
            System.out.println("Taste length must be greater than 0");
            return;
        }

        Hookah hookah = new Hookah(fortress, taste);
        hookahRepository.save(hookah);
    }

    public List<Hookah> getAllHookah() {
        return hookahRepository.findAll();
    }

    public void deleteHookahs() {
        hookahRepository.cleanAllHookah();
    }

    public List<Hookah> findByTaste(String taste){
        return hookahRepository.findByTaste(taste);
    }

    public void deleteByFrotress(String frotress){
        hookahRepository.deleteByFrotress(frotress);
    }

}

