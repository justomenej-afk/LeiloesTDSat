import java.util.ArrayList;

public class ProdutosDAO {

    private static ArrayList<ProdutosDTO> listagem = new ArrayList<>();

    public void cadastrarProduto(ProdutosDTO produto){
        listagem.add(produto);
    }

    public ArrayList<ProdutosDTO> listarProdutos(){
        return listagem;
    }

    public void venderProduto(int indice){
        listagem.get(indice).setStatus("Vendido");
    }

    public ArrayList<ProdutosDTO> listarProdutosVendidos(){

        ArrayList<ProdutosDTO> vendidos = new ArrayList<>();

        for(ProdutosDTO produto : listagem){

            if(produto.getStatus().equals("Vendido")){
                vendidos.add(produto);
            }

        }

        return vendidos;
    }

}