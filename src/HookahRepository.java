import java.util.ArrayList;
import java.util.List;

public class HookahRepository {
    List<Hookah> hookahList = new ArrayList<>();

    public void save(Hookah hookah) {
        hookahList.add(hookah);
    }

    public List<Hookah> findAll() {
        return hookahList;
    }

    public void cleanAllHookah() {
        hookahList.clear();
    }

    public List<Hookah> findByTaste(String taste) {
        List<Hookah> tasteList = new ArrayList<>();
        for (Hookah hookah : hookahList) {
            if(hookah.getTaste().equals(taste)) {
                tasteList.add(hookah);
            }
        }
        return tasteList;
    }

    public void deleteByFrotress(String frotress) {
        for (Hookah hookah : hookahList) {
            if(hookah.getFortress().equals(frotress)) {
                hookahList.remove(hookah);
            }
        }
    }
}
