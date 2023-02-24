package healthCare.repository;

import healthCare.model.Pessoa;

public interface PessoaRepository {
	
	//CRUD da conta
		public void procurarPorNome(String nome);
		public void listarTodas();
		public void cadastrar(Pessoa pessoa);
		public void atualizar(Pessoa Pessoa);
		public void deletar(String nome);
		

}
