import java.awt.Font;
 
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
 
public class LoginPage extends JFrame{
	private static int count=0;
	private static JButton bt1;//登陆按钮
	private static JLabel jl_1;//登录的版面
	private static JFrame jf_1;//登陆的框架
    private static JTextField jtext1;//用户名
    private static JPasswordField jtext2;//密码
    private static JLabel jl_admin;
    private static JLabel jl_password;
    public LoginPage (){//初始化登陆界面
    	Font font =new Font("Times New Roman", Font.PLAIN, 20);//设置字体
	    jf_1=new JFrame("Login Page");
		jf_1.setSize(450, 400);
		jl_1=new JLabel();
		
		jl_admin=new JLabel("Username");
		jl_admin.setBounds(20, 50, 80, 50);
		jl_admin.setFont(font);
		
		jl_password=new JLabel("Password");
		jl_password.setBounds(20, 120, 80, 50);
		jl_password.setFont(font);
		
		bt1=new JButton("Login");         //更改成loginButton
		bt1.setBounds(110, 250, 200, 50);
		bt1.setFont(font);
 
 
		//加入文本框
		jtext1=new JTextField("");
		jtext1.setBounds(150, 50, 250, 50);
		jtext1.setFont(font);
		
		jtext2=new JPasswordField("");//密码输入框
		jtext2.setBounds(150, 120, 250, 50);
		jtext2.setFont(font);
		
		jl_1.add(jtext1);
		jl_1.add(jtext2);
		
		jl_1.add(jl_admin);
		jl_1.add(jl_password);
		jl_1.add(bt1);
		
		jf_1.add(jl_1);
		jf_1.setVisible(true);
		jf_1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf_1.setLocation(300,400);
	}
	public static void main(String[] args) {
		//初始化登陆界面
		 
		LoginPage hl =new LoginPage();
		/**
		 * 处理点击事件
		 * 1.登陆按钮点击事件，判断账号密码是否正确，若正确，弹出监测信息界面
		 * 否则，无响应（暂时无响应）
		 * ：后可在登陆界面添加一个logLabel提示用户是否用户密码正确
		 * 2.退出按钮，直接退出程序
		 */
		//登陆点击事件
		ActionListener bt1_ls=new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				String admin=jtext1.getText();
				char[] password=jtext2.getPassword();
				String str=String.valueOf(password); //将char数组转化为string类型  
				System.out.println(admin);
				System.out.println(str);
				/*to jump*/
				hl.jf_1.dispose();//销毁当前界面

				
			}
		};
		bt1.addActionListener(bt1_ls);	
     }
}