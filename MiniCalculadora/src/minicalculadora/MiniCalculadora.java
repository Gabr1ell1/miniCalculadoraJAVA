package minicalculadora;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MiniCalculadora extends JFrame
{
    JLabel nun1, nun2, result,result2, autor;
    JTextField n1, n2;
    JButton soma, subtra, multi, div, 
    limpar, habilitar, desabilitar, ocultar,exibir, sair;
    
    public MiniCalculadora(){
        super("Mini Calculadora");
        Container tela = getContentPane();
        setLayout(null);
        
            nun1 = new JLabel("1° Número: ");
            nun2 = new JLabel("2° Número: ");
        
        n1 = new JTextField(10);
        n2 = new JTextField(10);
        
        
        result = new JLabel("Resultado: "); //Cria um rótulo para exibir o resultado 
        result2 = new JLabel("");
        
        
        //defini a posição da label dos numeros
        //- coluna -linha - largura -comprimento     
        nun1.setBounds(50,20,100,20); 
        nun2.setBounds (50,60,100,20); 
        
         //defini a posição do TextField dos numeros
        //- coluna -linha - largura -comprimento  
        n1.setBounds(120,20,100,20); 
        n2.setBounds(120,60,100,20);
        
        result.setBounds(50,120,800,20);
        result2.setBounds(115,120,800,20);
        //definindo a cor do resultado como vermelho
        result.setForeground(Color.red);

        
            soma = new JButton("+");
            subtra = new JButton("-");
            multi = new JButton("*");
            div = new JButton("/");
        
            
            limpar = new JButton("Limpar");
            habilitar = new JButton("Habilitar");
            desabilitar = new JButton("Dasabilitar"); 
            ocultar = new JButton("Ocultar");
            exibir = new JButton("Exibir");
            sair = new JButton("Sair");
         
        //defini a posição das operaçoes
        //- coluna -linha - largura -comprimento 
        soma.setBounds(300,20,50,20);
        subtra.setBounds(300,40,50,20);
        multi.setBounds(300,60,50,20);
        div.setBounds(300,80,50,20);
     
        //defini a posição das operaçoes 
        //- coluna -linha - largura -comprimento 
        limpar.setBounds(300,100,80,20);
        //colocando uma talho no botão limpar
        limpar.setMnemonic(KeyEvent.VK_L);
        
        
        habilitar.setBounds(50,150,90,20);
        desabilitar.setBounds(130,150,100,20);
        ocultar.setBounds(220,150,80,20);
        exibir.setBounds(300,150,80,20);
        
        //defini a posição das operaçoes 
        //- coluna -linha - largura -comprimento 
        sair.setBounds(300,200,80,20); 
        //colocando um atalho no botão sair
        sair.setMnemonic(KeyEvent.VK_S);

        autor = new JLabel("Desenvolvido por: Gabrielly - 2DS/AMS");
        autor.setBounds(80,250,300,20);

        soma.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
               
                int num1 = Integer.parseInt(n1.getText());
                int num2 = Integer.parseInt(n2.getText());
                
                int soma = num1 + num2; 
               result2.setText("A soma é: " + soma);
             
            }
            
        });
        
        subtra.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {  
            
                int num1 = Integer.parseInt(n1.getText());
                int num2 = Integer.parseInt(n2.getText());
                
                int subtra= num1 - num2;
                
                result2.setText("A subtração é: " + subtra);
                
            }
            
        });
        
        multi.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            
                int num1 = Integer.parseInt(n1.getText());
                int num2 = Integer.parseInt(n2.getText());
                
                int multi= num1 * num2;
                result2.setText("A multiplicação: " + multi);
                
            }
            
        });
        
        div.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
              
            
                int num1 = Integer.parseInt(n1.getText());
                int num2 = Integer.parseInt(n2.getText());              
            
                int div = num1 / num2;
                result2.setText("A divisão é: " + div);
               
            }
            
        });
        limpar.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e){
                n1.setText(null); // Limpa o texto dos campos null(vazio).
                n2.setText(null);  // Limpa o texto dos campos null(vazio).
                result2.setText(null);//limpa o resultado.
                n1.requestFocus();//solicita o foco de entrada para o 1° numero
            }           
        }
        ); 
        
        habilitar.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e){
            result.setEnabled(true);//habilita
            result2.setEnabled(true);//habilita
        }
        }
        );    
        desabilitar.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e){//método chamado quando o botão desabilitar é clicado.
            result.setEnabled(false);//desabilita
            result2.setEnabled(false);//desabilita
        }
        }
        );
        ocultar.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                result.setVisible(false);//oculta
                result2.setVisible(false);//oculta
            }                      
        }
        );
        exibir.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){   
                result.setVisible(true);//exibi
                result2.setVisible(true);//exibi
            }                      
        }
        );
        
        sair.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                System.exit(0);//fechando a janela
            }
        });
        
        
  
        tela.add(nun1);
        tela.add(nun2);
        tela.add(n1);
        tela.add(n2);
        
        tela.add(result);
        tela.add(result2);
          
        tela.add(soma);
        tela.add(subtra);
        tela.add(multi);
        tela.add(div);
        tela.add(limpar);
        
        tela.add(habilitar);
        tela.add(desabilitar);
        tela.add(ocultar);
        tela.add(exibir);
        tela.add(sair);
        tela.add(autor);
        
        
        setSize(800,450);
        setVisible(true);
    }
   
    public static void main(String[] args) 
    {
        MiniCalculadora app = new MiniCalculadora();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
