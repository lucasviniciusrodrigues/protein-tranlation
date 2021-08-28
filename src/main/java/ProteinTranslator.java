import java.util.ArrayList;
import java.util.List;

class ProteinTranslator {

    List<String> translate(String rnaSequence) {
        List<String> proteins = new ArrayList<>();

        String strAux;

        for(int i = 0; i + 2 < rnaSequence.length(); i += 3){
            String protein = Codons
                    .valueOf(rnaSequence.substring(i, i + 3))
                    .getProtein();

            if(protein.equals("STOP"))
                break;

            proteins.add(protein);
        }

        return proteins;
    }
}
