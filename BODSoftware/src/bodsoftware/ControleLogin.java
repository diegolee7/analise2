/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bodsoftware;

import Frames.FrameLogin;
import Frames.FrameMenuPrincipal;
import javax.swing.JOptionPane;

/**
 *
 * @author Bruno
 */
public class ControleLogin {
    
    private FrameMenuPrincipal menuPrincipal;
    private FrameLogin frameLogin;
    private String usuario,senha;
    
    public ControleLogin(FrameMenuPrincipal aux)
    {
        menuPrincipal=aux;
        frameLogin=new FrameLogin(); 
        frameLogin.setMenuPrincipal(menuPrincipal);
    }
    public void solicitarLogin()
    {
        loadLogin();
        frameLogin.mostrarFrameLogin(this);
    }
    public void setMenuPrincipal(FrameMenuPrincipal menuPrincipal)
    {
        this.menuPrincipal=menuPrincipal;
        
    }
    public void loadLogin()
    {
        usuario="adm";
        senha="adm";
    }
    
    public void verificarLogin(String usuario,String senha)
    {
        if(this.usuario.equals(usuario) && this.senha.equals(senha))
        {
            JOptionPane.showMessageDialog(null,"Conexão realizada com sucesso");  
        }
        else
        {
            JOptionPane.showMessageDialog(null,"Conta ou senha inválidos");  
            solicitarLogin();
        }
   }
    
    
}
