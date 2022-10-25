package br.com.havec.gerenciador1.servlet;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;



public class Banco {
	
	private static List<Empresa> lista = new ArrayList<>();
	private static Integer chaveSequencial = 1;
	
	static {
		Empresa empresa = new Empresa();
		empresa.setId(chaveSequencial++);
		empresa.setNome("TopSoft");
		Empresa empresa2 = new Empresa();
		empresa2.setId(chaveSequencial++);
		empresa2.setNome("Microsoft");
		lista.add(empresa2);
		lista.add(empresa);
	}
	
	public void adiciona(Empresa empresa) {
		empresa.setId(chaveSequencial++);
		Banco.lista.add(empresa);	
	}

	public List<Empresa> getEmpresas() {
		return Banco.lista;	
	}

	public void apagarEmpresa(Integer id) {
		Iterator<Empresa> it = lista.iterator();
		
		while(it.hasNext()) {
			
			Empresa emp = it.next();
			
			if(emp.getId() == id) {
				it.remove();
			}
		}	
	}
}
