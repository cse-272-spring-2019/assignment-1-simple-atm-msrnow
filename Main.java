
package rashad;

import javafx.application.*;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.*;
import javafx.scene.*;
import javafx.stage.*;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.*;
import javafx.geometry.*;

public class Main extends Application{

	public static void main(String[] args) {
		launch(args);

	}

	public void start(Stage primaryStage)
	{
		Client client=new Client() ;
		Stage window = primaryStage;
		///////// scene 1 //////////////////
		Button B1,b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,bd;
                      
                        
                       
		Label label1,label11;
		TextField T1;
		
		B1=new Button();
		label1 =new Label();
		label11=new Label();
                
		T1= new TextField();
              
                b1=new Button(); b2=new Button();   b3=new Button();  b4=new Button();   b5=new Button()  ;
                b6=new Button();  b7=new Button(); b8=new Button();  b9=new Button();  b0=new Button();    bd=new Button();
                
		B1.setText("enter now your account");
		label1.setText("Card Number");
		b1.setText("   1    "); b2.setText("   2    "); b3.setText("   3    ");b4.setText("   4    ");  b5.setText("   5    ");
                b6.setText("   6    "); b7.setText("   7    ");   b8.setText("   8    "); b9.setText("   9    "); b0.setText("   0    ");
                bd.setText(" delete ");
          
		GridPane grid1 = new GridPane();
		grid1.add(B1,4,18);
		grid1.add(label1 ,  0,0);
	 	
                grid1.add(label11 ,  3,3);
	       		
                grid1.add(T1 , 4,4);
             
                 grid1.add(b1,7,8);
                 grid1.add(b2,9,8);
                 grid1.add(b3,11,8);
                 grid1.add(b4,7,9);
                 grid1.add(b5,9,9);
                 grid1.add(b6,11,9);
                 grid1.add(b7,7,10);
                 grid1.add(b8,9,10);
                 grid1.add(b9,11,10);
                 grid1.add(b0,7,11);
                 grid1.add(bd,9,11);
               
		Scene scene1=new Scene(grid1,1000,1000);
		window.setScene(scene1);
		window.show();
	
		
		///////// scene 2 //////////////////
		Button B2,B3,B4,B5,B6,B7;
		Label label2;
		Label label3;
		Label label10,label111;
		
		B2=new Button();
		B3=new Button();
		B4=new Button();
		B5=new Button();
		B5.setDisable(true);
		B6=new Button();
		B7=new Button();
		label2 =new Label();
		label3 =new Label();
		label10= new Label();
		label111=new Label();
		B2.setText("Deposit");
		B3.setText("WithDraw");
		B4.setText("Your current Balance");
		B5.setText("Next");
		B6.setText("Previous");
		B7.setText("Back");
		label2.setText("Your option");
		

		GridPane grid2 = new GridPane();
		grid2.add(B2,7,1);
		grid2.add(B3,7,2);
		grid2.add(B4,7,3);
		grid2.add(B5,7,4);
		grid2.add(B6,7,5);
		grid2.add(B7,7,6);
		grid2.add(label111 ,  4,6);
		grid2.add(label2 ,  0,0);
		grid2.add(label3 ,  5,3);
		grid2.add(label10 ,  5,4);
		Scene scene2=new Scene(grid2,1000,1000);
		//window.setScene(scene2);
		window.show();
	
		///////// scene 3 //////////////////
		Button B8,B9,b11,b21,b31,b41,b51,b61,b71,b81,b91,b01,bd1;
		Label label4,label7,L3;
		TextField T4,TT;
		
		B9=new Button();
		B8=new Button();
                b11=new Button();  b21=new Button();  b31=new Button();   b41=new Button();   b51=new Button();   b61=new Button();   b71=new Button(); 
                  b81=new Button();  b91=new Button();  b01=new Button();       bd1=new Button();
		label4 =new Label();
                L3 =new Label();
		label7 =new Label();
		T4= new TextField();
                TT= new TextField();
                 b11.setText("   1    ");   b21.setText("   2    "); b31.setText("   3    "); b41.setText("   4    "); b51.setText("   5    ");
                b61.setText("   6    "); b71.setText("   7    "); b81.setText("   8    ");b91.setText("   9    ");b01.setText("   0    ");
		bd1.setText("   Delete    ");
		B8.setText("Deposit");
		B9.setText("back");
		label4.setText("How much you want to deposite");
		
		GridPane grid3 = new GridPane();
		grid3.add(B8,1,1);
		grid3.add(B9,2,1);
		grid3.add(label4 ,  2,2);
		grid3.add(label7 ,3,1);
                grid3.add(L3 ,7,1);
		grid3.add(T4,3,3);
                grid3.add(TT,5,1);
                
                 grid3.add(b11,5,5);
                 grid3.add(b21,7,5);
                 grid3.add(b31,9,5);
                 grid3.add(b41,5,6);
                 grid3.add(b51,7,6);
                 grid3.add(b61,9,6);
                 grid3.add(b71,5,7);
                 grid3.add(b81,7,7);
                 grid3.add(b91,9,7);
                 grid3.add(b01,5,8);
                 grid3.add(bd1,7,8);
                
		Scene scene3=new Scene(grid3,1000,1000);
		
		
		
////////scene 4 //////////////////
		Button BW,BB,b12,b22,b32,b42,b52,b62,b72,b82,b92,b02,bd2;
		Label label5,label6,L4;
		TextField T5,TF;
		
		BW=new Button();
		BB=new Button();
                     b12=new Button(); b22=new Button();b32=new Button(); b42=new Button();b52=new Button();
                b62=new Button();  b72=new Button(); b82=new Button(); b92=new Button();
               
                b02=new Button(); bd2=new Button();
		label5 =new Label();
		label6=new Label();
		L4=new Label();
		T5= new TextField();
                TF= new TextField();
		label5.setText("How much you want to WithDraw");
		BW.setText("WithDraw ");
		BB.setText("back");
                 
                b12.setText("   1    ");b22.setText("   2    ");b32.setText("   3    ");  b42.setText("   4    "); b52.setText("   5    ");
                b62.setText("   6    "); b72.setText("   7    "); b82.setText("   8    "); b92.setText("   9    "); b02.setText("   0    ");
                bd2.setText(" delete ");
		
		
		GridPane grid4 = new GridPane();
		grid4.add(BW,0,0);
		grid4.add(BB,2,2);
		grid4.add(label5,3,3);
		grid4.add(label6,7,3);
		grid4.add(T5 ,3,4);
                grid4.add(L4,13,3);
                grid4.add(TF,11,3);
                grid4.add(b12,5,5);
                 grid4.add(b22,7,5);
                 grid4.add(b32,9,5);
                 grid4.add(b42,5,6);
                 grid4.add(b52,7,6);
                 grid4.add(b62,9,6);
                 grid4.add(b72,5,7);
                 grid4.add(b82,7,7);
                 grid4.add(b92,9,7);
                 grid4.add(b02,5,8);
                 grid4.add(bd2,7,8);
             
		Scene scene4=new Scene(grid4,1000,1000);
	
		
		
		/////////////// button op //////////////
		B1.setOnAction(new EventHandler<ActionEvent>(){
			public void handle (ActionEvent event)
			{
				if(T1.getText().equals("3699"))
					window.setScene(scene2);
				else
					label11.setText("Invalid Number Try again");
                                        T1.setText("");
			}});
		
		
		B7.setOnAction(new EventHandler<ActionEvent>(){
			public void handle (ActionEvent event)
			{
				
				window.setScene(scene1);
				T1.setText("");
                            /*    T22.setText("");
                                T32.setText("");
                                T42.setText("");
				*/
					
			}});
		B4.setOnAction(new EventHandler<ActionEvent>(){
			public void handle (ActionEvent event)
			{
				double x = client.getBalance2();
				String y = String.valueOf(x);
				label3.setText(y);
                                label111.setText("");
					
				
					
			}});
		B9.setOnAction(new EventHandler<ActionEvent>(){
			public void handle (ActionEvent event)
			{
				window.setScene(scene2);
				label7.setText("");	
				  T4.setText("");	
				 L3.setText("");
					   TT.setText("");
			}});
		BB.setOnAction(new EventHandler<ActionEvent>(){
			public void handle (ActionEvent event)
			{
				window.setScene(scene2);
				
				label6.setText("");
                                T5.setText("");
                                  TF.setText("");
				 L4.setText(" ");
					
			}});
		B2.setOnAction(new EventHandler<ActionEvent>(){
			public void handle (ActionEvent event)
			{
				window.setScene(scene3);
				label3.setText("");
                                label111.setText("");
					
			}});
		B8.setOnAction(new EventHandler<ActionEvent>(){
			public void handle (ActionEvent event)
			{
				
				
				String x=T4.getText();
				double  y =Double.parseDouble(x);
                                if(y<0)
                                {
                                
                                    label7.setText("you cannot deposit with  ");
                                
				TT.setText(T4.getText());
                                 
                                T4.setText("enter positive number please or go to back");
                                }
                                else{
				client.deposit(y);
				label7.setText("Deposit with  ");
                                
				TT.setText(T4.getText());
                                 
                                T4.setText("");
                                 
                                L3.setText("Enter back to go to main options  ");  
                                }}});
		B3.setOnAction(new EventHandler<ActionEvent>(){
			public void handle (ActionEvent event)
			{
				window.setScene(scene4);
				T5.clear();
				label3.setText("");
                                label111.setText("");
					
			}});
		BW.setOnAction(new EventHandler<ActionEvent>(){
			public void handle (ActionEvent event)
			{
				
				
				String x=T5.getText();
				double r = client.getBalance();
				double  y =Double.parseDouble(x);
                                if(y>0){
				if(y>r) {
					label6.setText("Your balance is less than you want");	
                                        
                                }
                               
                               
                              
				else 
					{client.WithDraw(y);
				label6.setText("WithDraw with  ");
                                TF.setText(T5.getText());
                                L4.setText("Enter back to go to main options  ");
                                        T5.setText("");}	}
                        else
                                    label6.setText("Wrong! you want to Withdraw with ");
                                     TF.setText(T5.getText());
                                L4.setText("enter positive number please or go back  ");
                                    }});
		
		B6.setOnAction(new EventHandler<ActionEvent>(){
			public void handle (ActionEvent event)
			{
				B5.setDisable(false);
				if (client.getIndex() == 1)
				{
				B6.setDisable(true);
                                label3.setText("");
				}
				String x =client.Previous(); 
				label111.setText(x);	
					label3.setText("");
			}});
		B5.setOnAction(new EventHandler<ActionEvent>(){
			public void handle (ActionEvent event)
			{
				B6.setDisable(false);
				if (client.getIndex() == client.getSize()-2 )
				{
				B5.setDisable(true);
                                label3.setText("");
				}
				
				String x = client.Next1();
				label111.setText(x);
                                label3.setText("");
			}});
                  
                b1.setOnAction(new EventHandler<ActionEvent>(){
			public void handle (ActionEvent event)
			{
                            label11.setText("");
                            
				if(T1.getText().equals("")) {
                            
                                    T1.setText("1");}
                                else
                                {
                                    String x=T1.getText();
                                    int y=Integer.valueOf(x);
                                    y=y*10+1;
                                    String z=String.valueOf(y);
                                    T1.setText(z);
                                    
                                    
                                }
                            
                                }
                                
       	
					
			});
       
                
                
                  b2.setOnAction(new EventHandler<ActionEvent>(){
			public void handle (ActionEvent event)
			{
                              label11.setText("");
				if(T1.getText().equals("")) {
                            
                                    T1.setText("2");}
                                else
                                {
                                 String x=T1.getText();
                                    int y=Integer.valueOf(x);
                                    y=y*10+2;
                                    String z=String.valueOf(y);
                                    T1.setText(z);
                                
                                }
                            
                                }
                });
                    b3.setOnAction(new EventHandler<ActionEvent>(){
			public void handle (ActionEvent event)
			{
                              label11.setText("");
				if(T1.getText().equals("")) {
                            
                                    T1.setText("3");}
                            
                                else
                                {
                                
                                     String x=T1.getText();
                                    int y=Integer.valueOf(x);
                                    y=y*10+3;
                                    String z=String.valueOf(y);
                                    T1.setText(z);
                                
                                }
                                
                                
                                
                                }
                });
                      b4.setOnAction(new EventHandler<ActionEvent>(){
			public void handle (ActionEvent event)
			{
                              label11.setText("");
				if(T1.getText().equals("")) {
                            
                                    T1.setText("4");}
                            
                                else
                                {
                                 String x=T1.getText();
                                    int y=Integer.valueOf(x);
                                    y=y*10+4;
                                    String z=String.valueOf(y);
                                    T1.setText(z);
                                
                                }
                                
                                
                                }
                });
                        b5.setOnAction(new EventHandler<ActionEvent>(){
			public void handle (ActionEvent event)
			{  label11.setText("");
				if(T1.getText().equals("")) {
                            
                                    T1.setText("5");}
                            
                                else
                                {
                                 String x=T1.getText();
                                    int y=Integer.valueOf(x);
                                    y=y*10+5;
                                    String z=String.valueOf(y);
                                    T1.setText(z);
                                
                                }
                                
                                
                                }
                });
                          b6.setOnAction(new EventHandler<ActionEvent>(){
			public void handle (ActionEvent event)
			{  label11.setText("");
				if(T1.getText().equals("")) {
                            
                                    T1.setText("6");}
                            
                                
                        else
                        {
                         String x=T1.getText();
                                    int y=Integer.valueOf(x);
                                    y=y*10+6;
                                    String z=String.valueOf(y);
                                    T1.setText(z);
                        
                        }
                        } });
                            b7.setOnAction(new EventHandler<ActionEvent>(){
			public void handle (ActionEvent event)
			{  label11.setText("");
				if(T1.getText().equals("")) {
                            
                                   T1.setText("7");}
                         
                                
                                 else
                        {
                         String x=T1.getText();
                                    int y=Integer.valueOf(x);
                                    y=y*10+7;
                                    String z=String.valueOf(y);
                                    T1.setText(z);
                        
                        }
                                
                                
                                
                                }
                });
                              b8.setOnAction(new EventHandler<ActionEvent>(){
			public void handle (ActionEvent event)
			{  label11.setText("");
			if(T1.getText().equals("")) {
                            
                                   T1.setText("7");}
                         
                                
                                 else
                        {
                         String x=T1.getText();
                                    int y=Integer.valueOf(x);
                                    y=y*10+8;
                                    String z=String.valueOf(y);
                                    T1.setText(z);
                        
                        }
                                
                                
                                
                                }
                });
                                b9.setOnAction(new EventHandler<ActionEvent>(){
			public void handle (ActionEvent event)
			{  label11.setText("");
				if(T1.getText().equals("")) {
                            
                                    T1.setText("9");}
                            
                                 else
                        {
                         String x=T1.getText();
                                    int y=Integer.valueOf(x);
                                    if(y==0)
                                    {
                                     String z=String.valueOf(y);
                                     
                                    T1.setText(z);
                                    
                                    }
                                    y=y*10+9;
                                    String z=String.valueOf(y);
                                    T1.setText(z);
                                    
                        
                        }
                                
                                
                                }
                });
                                  b0.setOnAction(new EventHandler<ActionEvent>(){
			public void handle (ActionEvent event)
			{  label11.setText("");
				if(T1.getText().equals("")) {
                            
                                    T1.setText("0");}
                            
                                 else
                        {
                         String x=T1.getText();
                                    int y=Integer.valueOf(x);
                                    y=y*10+0;
                                    String z=String.valueOf(y);
                                    T1.setText(z);
                        
                        }
                                
                                
                                }
                });
                                   bd.setOnAction(new EventHandler<ActionEvent>(){
			public void handle (ActionEvent event)
			{
                             
					  label11.setText("");
				
                        
                               String x=T1.getText();
                                    int y=Integer.valueOf(x);
                                    
                                    y=y/10;
                                    
                                    
                                    String z=String.valueOf(y);
                                    T1.setText(z);
                                    if(y==0)
                                    {T1.setText("");
                                    }
                                    
                                    }
                        
					
			});
                                   
                                   
                                   
                                      b11.setOnAction(new EventHandler<ActionEvent>(){
			public void handle (ActionEvent event)
			{
                            label7.setText(" ");
                                
				TT.setText("");
                                L3.setText(" ");  
				if(T4.getText().equals("")) {
                            
                                    T4.setText("1");}
                                else
                                {
                                    String x=T4.getText();
                                    int y=Integer.valueOf(x);
                                    y=y*10+1;
                                    String z=String.valueOf(y);
                                    T4.setText(z);
                                    
                                    
                                }
                            
                                }
                                
       	
					
			});
       
                
                
                  b21.setOnAction(new EventHandler<ActionEvent>(){
			public void handle (ActionEvent event)
			{
                            
                             label7.setText(" ");
                                
				TT.setText("");
                                L3.setText(" ");  
				if(T4.getText().equals("")) {
                            
                                    T4.setText("2");}
                                else
                                {
                                 String x=T4.getText();
                                    int y=Integer.valueOf(x);
                                    y=y*10+2;
                                    String z=String.valueOf(y);
                                    T4.setText(z);
                                
                                }
                            
                                }
                });
                    b31.setOnAction(new EventHandler<ActionEvent>(){
			public void handle (ActionEvent event)
			{
                            
                             label7.setText(" ");
                                
				TT.setText("");
                                L3.setText(" ");  
				if(T4.getText().equals("")) {
                            
                                    T4.setText("3");}
                            
                                else
                                {
                                
                                     String x=T4.getText();
                                    int y=Integer.valueOf(x);
                                    y=y*10+3;
                                    String z=String.valueOf(y);
                                    T4.setText(z);
                                
                                }
                                
                                
                                
                                }
                });
                      b41.setOnAction(new EventHandler<ActionEvent>(){
			public void handle (ActionEvent event)
			{
                            
                             label7.setText(" ");
                                
				TT.setText("");
                                L3.setText(" ");  
				if(T4.getText().equals("")) {
                            
                                    T4.setText("4");}
                            
                                else
                                {
                                 String x=T4.getText();
                                    int y=Integer.valueOf(x);
                                    y=y*10+4;
                                    String z=String.valueOf(y);
                                    T4.setText(z);
                                
                                }
                                
                                
                                }
                });
                        b51.setOnAction(new EventHandler<ActionEvent>(){
			public void handle (ActionEvent event)
			{
                            
                             label7.setText(" ");
                                
				TT.setText("");
                                L3.setText(" ");  
				if(T4.getText().equals("")) {
                            
                                    T4.setText("5");}
                            
                                else
                                {
                                 String x=T4.getText();
                                    int y=Integer.valueOf(x);
                                    y=y*10+5;
                                    String z=String.valueOf(y);
                                    T4.setText(z);
                                
                                }
                                
                                
                                }
                });
                          b61.setOnAction(new EventHandler<ActionEvent>(){
			public void handle (ActionEvent event)
			{
                             label7.setText(" ");
                                
				TT.setText("");
                                L3.setText(" ");  
				if(T4.getText().equals("")) {
                            
                                    T4.setText("6");}
                            
                                
                        else
                        {
                         String x=T4.getText();
                                    int y=Integer.valueOf(x);
                                    y=y*10+6;
                                    String z=String.valueOf(y);
                                    T4.setText(z);
                        
                        }
                        } });
                            b71.setOnAction(new EventHandler<ActionEvent>(){
			public void handle (ActionEvent event)
			{
                             label7.setText(" ");
                                
				TT.setText("");
                                L3.setText(" ");  
				if(T4.getText().equals("")) {
                            
                                   T4.setText("7");}
                         
                                
                                 else
                        {
                         String x=T4.getText();
                                    int y=Integer.valueOf(x);
                                    y=y*10+7;
                                    String z=String.valueOf(y);
                                    T4.setText(z);
                        
                        }
                                
                                
                                
                                }
                });
                              b81.setOnAction(new EventHandler<ActionEvent>(){
			public void handle (ActionEvent event)
			{
                            
				{
                                    
                                     label7.setText(" ");
                                
				TT.setText("");
                                L3.setText(" ");  
                                    
				if(T4.getText().equals("")) {
                            
                                    T4.setText("8");}
                            
                                 else
                        {
                         String x=T4.getText();
                                    int y=Integer.valueOf(x);
                                    y=y*10+8;
                                    String z=String.valueOf(y);
                                    T4.setText(z);
                        
                        }
                               
                       
                                
                                
                                
                                }
              }  });
                                b91.setOnAction(new EventHandler<ActionEvent>(){
			public void handle (ActionEvent event)
			{
                             label7.setText(" ");
                                
				TT.setText("");
                                L3.setText(" ");  
				if(T4.getText().equals("")) {
                            
                                    T4.setText("9");}
                            
                                 else
                        {
                         String x=T4.getText();
                                    int y=Integer.valueOf(x);
                                    y=y*10+9;
                                    String z=String.valueOf(y);
                                    T4.setText(z);
                        
                        }
                                
                                
                                }
                });
                                  b01.setOnAction(new EventHandler<ActionEvent>(){
			public void handle (ActionEvent event)
			{
                             label7.setText(" ");
                                
				TT.setText("");
                                L3.setText(" ");  
					
                        
                         String x=T4.getText();
                                    int y=Integer.valueOf(x);
                                    y=y*10;
                                    String z=String.valueOf(y);
                                    T4.setText(z);
                        
                        }
                        
                        
                                
                                
                                
                });
                                   bd1.setOnAction(new EventHandler<ActionEvent>(){
			public void handle (ActionEvent event)
			{
                             label7.setText(" ");
                                
				TT.setText("");
                                L3.setText(" ");  
					
				
                        
                               String x=T4.getText();
                                    int y=Integer.valueOf(x);
                                    
                                    y=y/10;
                                    
                                    
                                    String z=String.valueOf(y);
                                    T4.setText(z);
                                    if(y==0)
                                    {T4.setText("");
                                    }
                                    
                                    }
                        
					
			});
                                   
                                   
                                   
                                                      
                                      b12.setOnAction(new EventHandler<ActionEvent>(){
			public void handle (ActionEvent event)
			{
                            label6.setText(" ");
                                TF.setText("");
                                L4.setText("");
                                       
				if(T5.getText().equals("")) {
                            
                                    T5.setText("1");}
                                else
                                {
                                    String x=T5.getText();
                                    int y=Integer.valueOf(x);
                                    y=y*10+1;
                                    String z=String.valueOf(y);
                                    T5.setText(z);
                                    
                                    
                                }
                            
                                }
                                
       	
					
			});
       
                
                
                  b22.setOnAction(new EventHandler<ActionEvent>(){
			public void handle (ActionEvent event)
			{
                             label6.setText(" ");
                                TF.setText("");
                                L4.setText("");
				if(T5.getText().equals("")) {
                            
                                    T5.setText("2");}
                                else
                                {
                                 String x=T5.getText();
                                    int y=Integer.valueOf(x);
                                    y=y*10+2;
                                    String z=String.valueOf(y);
                                    T5.setText(z);
                                
                                }
                            
                                }
                });
                    b32.setOnAction(new EventHandler<ActionEvent>(){
			public void handle (ActionEvent event)
			{
                             label6.setText(" ");
                                TF.setText("");
                                L4.setText("");
				if(T5.getText().equals("")) {
                            
                                    T5.setText("3");}
                            
                                else
                                {
                                
                                     String x=T5.getText();
                                    int y=Integer.valueOf(x);
                                    y=y*10+3;
                                    String z=String.valueOf(y);
                                    T5.setText(z);
                                
                                }
                                
                                
                                
                                }
                });
                      b42.setOnAction(new EventHandler<ActionEvent>(){
			public void handle (ActionEvent event)
			{
                             label6.setText(" ");
                                TF.setText("");
                                L4.setText("");
				if(T5.getText().equals("")) {
                            
                                    T5.setText("4");}
                            
                                else
                                {
                                 String x=T5.getText();
                                    int y=Integer.valueOf(x);
                                    y=y*10+4;
                                    String z=String.valueOf(y);
                                    T5.setText(z);
                                
                                }
                                
                                
                                }
                });
                        b52.setOnAction(new EventHandler<ActionEvent>(){
			public void handle (ActionEvent event)
			{
                             label6.setText(" ");
                                TF.setText("");
                                L4.setText("");
				if(T5.getText().equals("")) {
                            
                                    T5.setText("5");}
                            
                                else
                                {
                                 String x=T5.getText();
                                    int y=Integer.valueOf(x);
                                    y=y*10+5;
                                    String z=String.valueOf(y);
                                    T5.setText(z);
                                
                                }
                                
                                
                                }
                });
                          b62.setOnAction(new EventHandler<ActionEvent>(){
			public void handle (ActionEvent event)
			{
                             label6.setText(" ");
                                TF.setText("");
                                L4.setText("");
				if(T5.getText().equals("")) {
                            
                                    T5.setText("6");}
                            
                                
                        else
                        {
                         String x=T5.getText();
                                    int y=Integer.valueOf(x);
                                    y=y*10+6;
                                    String z=String.valueOf(y);
                                    T5.setText(z);
                        
                        }
                        } });
                            b72.setOnAction(new EventHandler<ActionEvent>(){
			public void handle (ActionEvent event)
			{
                             label6.setText(" ");
                                TF.setText("");
                                L4.setText("");
				if(T5.getText().equals("")) {
                            
                                   T5.setText("7");}
                         
                                
                                 else
                        {
                         String x=T5.getText();
                                    int y=Integer.valueOf(x);
                                    y=y*10+7;
                                    String z=String.valueOf(y);
                                    T5.setText(z);
                        
                        }
                                
                                
                                
                                }
                });
                              b82.setOnAction(new EventHandler<ActionEvent>(){
			public void handle (ActionEvent event)
			{
                             label6.setText(" ");
                                TF.setText("");
                                L4.setText("");
				if(T5.getText().equals("")) {
                            
                                    T5.setText("8");}
                            
                                 else
                        {
                         String x=T5.getText();
                                    int y=Integer.valueOf(x);
                                    y=y*10+8;
                                    String z=String.valueOf(y);
                                    T5.setText(z);
                        
                        }
                                
                                
                                
                                }
                });
                                b92.setOnAction(new EventHandler<ActionEvent>(){
			public void handle (ActionEvent event)
			{
                             label6.setText(" ");
                                TF.setText("");
                                L4.setText("");
				if(T5.getText().equals("")) {
                            
                                    T5.setText("9");}
                            
                                 else
                        {
                         String x=T5.getText();
                                    int y=Integer.valueOf(x);
                                    y=y*10+9;
                                    String z=String.valueOf(y);
                                    T5.setText(z);
                        
                        }
                                
                                
                                }
                });
                                  b02.setOnAction(new EventHandler<ActionEvent>(){
			public void handle (ActionEvent event)
			{
                             label6.setText(" ");
                                TF.setText("");
                                L4.setText("");
				if(T5.getText().equals("")) {
                            
                                    T5.setText("0");}
                            
                                 else
                        {
                         String x=T5.getText();
                                    int y=Integer.valueOf(x);
                                    y=y*10+0;
                                    String z=String.valueOf(y);
                                    T5.setText(z);
                        
                        }
                                
                                
                                }
                });
                                   bd2.setOnAction(new EventHandler<ActionEvent>(){
			public void handle (ActionEvent event)
			{ label6.setText(" ");
                                TF.setText("");
                                L4.setText("");
					
				
                        
                               String x=T5.getText();
                                    int y=Integer.valueOf(x);
                                    
                                    y=y/10;
                                    
                                    
                                    String z=String.valueOf(y);
                                    T5.setText(z);
                                    if(y==0)
                                    {T5.setText("");
                                    }
                                    
                                    }
                        
					
			});
                                   
     
	}
}










