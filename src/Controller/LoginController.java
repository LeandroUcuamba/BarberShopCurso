package Controller;

import Model.Usuario;
import View.Login;
import Controller.Helper.LoginHelper;

/**
 *
 * @author Leandro
 */
public class LoginController {

    private final Login view;
    private final LoginHelper helper;


    public LoginController(Login view) {
        this.view = view;
        this.helper = new LoginHelper(view);
       
    }
    
    public void entrarNoSistema(){
        
        // Pegar um Usuario da view;
        Usuario usuario = helper.obterModelo();
                  
        // Pesquisar usuario no banco de dados;
        /* Se o Usuario da view tiver o mesmo "usuario" e "senha" que o 
        usuario vindo ao banco direcionar para menu */
        // Senão mostrar uma mensagem ao usuario "usuario ou senha" invalidos;
        
    }
    
    public void fizTarefa(){
        System.out.println("Busquei algo no banco de dados");
        
        this.view.exibeMensagem("Executei o fiz tarefa");
    }
    
    
}
