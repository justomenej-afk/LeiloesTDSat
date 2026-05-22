import java.util.ArrayList;

public class ProdutosDAO {

    private static ArrayList<ProdutosDTO> listagem = new ArrayList<>();

    public void cadastrarProduto(ProdutosDTO produto){
        listagem.add(produto);
    }

    public ArrayList<ProdutosDTO> listarProdutos(){
        return listagem;
    }
}