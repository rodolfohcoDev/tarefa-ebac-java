package br.tarefa.classe;

public class Cadastrar {
	    
	  
	
		 /**
         * Metodo para inserir os dados do Cliente, utilizando o cadastro da Ana Silva
		 * @author Rodolfo Oliveira
		 * @return Cliente
		 */
		public Cliente criarClienteFeminino() {
	        Cliente novoCliente = new Cliente();
	        novoCliente.setCodigo(); 

	        novoCliente.setNome( "Ana  Silva");
	        novoCliente.setIdade(18); 
	        novoCliente.setSexo(Sexo.feminino);
	        novoCliente.setTelefone(gerarTelefoneCelular2());
	        novoCliente.setEmail("ana.silva@emailaleatorio.com");

	        Endereco enderecoAleatorio = new Endereco();
	        enderecoAleatorio.setEndereco("Avenida Brasil");
	        enderecoAleatorio.setNumero("1");
	        enderecoAleatorio.setBairro("Centro");
	        enderecoAleatorio.setCidade("São Paulo");
	        enderecoAleatorio.setEstado("SP");
	        enderecoAleatorio.setPais("Brasil");
	        novoCliente.setEndereco(enderecoAleatorio);

	        return novoCliente;
	    }
		
		

		 /**
        * Metodo para inserir os dados do Cliente, utilizando o cadastro da Paulo Ricardo
		 * @author Rodolfo Oliveira
		 * @return Cliente
		 */
		public Cliente criarClienteMasculino() {
	        Cliente novoCliente = new Cliente();
	        novoCliente.setCodigo(); 

	        novoCliente.setNome( "Paulo Ricardo");
	        novoCliente.setIdade(35); 
	        novoCliente.setSexo(Sexo.masculino);
	        novoCliente.setTelefone(gerarTelefoneCelular1());
	        novoCliente.setEmail("paulo.ricardo@emailaleatorio.com");
	        Endereco enderecoAleatorio = new Endereco();
	        enderecoAleatorio.setEndereco("Avenida Paulista");
	        enderecoAleatorio.setNumero("1");
	        enderecoAleatorio.setBairro("Zona Sul");
	        enderecoAleatorio.setCidade("São Paulo");
	        enderecoAleatorio.setEstado("SP");
	        enderecoAleatorio.setPais("Brasil");
	        novoCliente.setEndereco(enderecoAleatorio);

	        return novoCliente;
	    }
		
		/**
         * Metodo para inserir os dados do Telefone
		 * @author Rodolfo Oliveira
		 * @deprecated
		 * @return Cliente
		 */
	    private String gerarTelefone() {
	        StringBuilder telefone = new StringBuilder();
	        telefone.append("(11)9988-9999");
	        return telefone.toString();
	    }

	    
		/**
         * Metodo para inserir os dados do Telefone
		 * @author Rodolfo Oliveira
		 * @return Cliente
		 * @since 2
		 */
	    private String gerarTelefoneCelular2() {
	        StringBuilder telefone = new StringBuilder();
	        telefone.append("(11)9988-9999");
	        return telefone.toString();
	    }

		/**
         * Metodo para inserir os dados do Telefone
		 * @author Rodolfo Oliveira
		 * @return string
		 * @since 1
		 */
	    private String gerarTelefoneCelular1() {
	        StringBuilder telefone = new StringBuilder();
	        telefone.append("(11)98788-9999");
	        return telefone.toString();
	    }
	    

	    public void inserirNovoClienteFeminino() {
	        Cliente clienteInserido = criarClienteFeminino();
	        System.out.println("Nova cliente inserida:");
	        System.out.println("Código: " + clienteInserido.getCodigo());
	        System.out.println("Nome: " + clienteInserido.getNome());
	        System.out.println("Idade: " + clienteInserido.getIdade());
	        System.out.println("Sexo: " + clienteInserido.getSexo());
	        System.out.println("Telefone: " + clienteInserido.getTelefone());
	        System.out.println("Email: " + clienteInserido.getEmail());
	        System.out.println("Endereço: " + clienteInserido.getEndereco().getEndereco() + ", " + clienteInserido.getEndereco().getNumero() + " - " + clienteInserido.getEndereco().getBairro() + ", " + clienteInserido.getEndereco().getCidade() + " - " + clienteInserido.getEndereco().getEstado() + ", " + clienteInserido.getEndereco().getPais());
	        System.out.println("--------------------");
	    }

	    
	    public void inserirNovoClienteMasculino() {
	        Cliente clienteInserido = criarClienteMasculino();
	        System.out.println("Nova cliente inserida:");
	        System.out.println("Código: " + clienteInserido.getCodigo());
	        System.out.println("Nome: " + clienteInserido.getNome());
	        System.out.println("Idade: " + clienteInserido.getIdade());
	        System.out.println("Sexo: " + clienteInserido.getSexo());
	        System.out.println("Telefone: " + clienteInserido.getTelefone());
	        System.out.println("Email: " + clienteInserido.getEmail());
	        System.out.println("Endereço: " + clienteInserido.getEndereco().getEndereco() + ", " + clienteInserido.getEndereco().getNumero() + " - " + clienteInserido.getEndereco().getBairro() + ", " + clienteInserido.getEndereco().getCidade() + " - " + clienteInserido.getEndereco().getEstado() + ", " + clienteInserido.getEndereco().getPais());
	        System.out.println("--------------------");
	    }


	
    

}
