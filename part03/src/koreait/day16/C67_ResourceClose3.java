package koreait.day16;


import java.awt.FileDialog;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
import javax.swing.JFrame;

// �о� �� �� �ִ� �ؽ�Ʈ ������ ���ڵ��� ��ġ�ؾ��մϴ�.
// workspace UTF-8 �̸� �ؽ�Ʈ���� UTF-8 ���ĸ�
//			 MS949 �̸� �ؽ�Ʈ���� ANSI ���ĸ�


public class C67_ResourceClose3 implements AutoCloseable{

	public static void main(String[] args) {
		// ���� ��������
//		String filename = "C:\\Users\\user\\iclass05\\�ڹ��׽�Ʈ.txt";   
//		String filename2 = "C:\\Users\\user\\iclass05\\�ڹ��׽�Ʈ3.txt";   
	
		// ���� ��ȭ���� ����ϱ�
		String filename = fileDialogOpen();
		String filename2 = fileDialogSave();
		File ifile = new File(filename);
		File ofile = new File(filename2);
		
		
		
		try(Scanner sc = new Scanner(ifile);PrintWriter pw = new PrintWriter(ofile)) {
	//		sc = new Scanner(file);	
			while(sc.hasNext()) { 
				String temp = sc.nextLine();		// ���Ͽ��� �о�� 1��
				System.out.println(temp);			// ǥ�� ���(�ܼ�)
				pw.println(temp);					// ���� ���
			}
			System.out.println("���� ���簡 �Ϸ�Ǿ����ϴ�.");
		}catch(FileNotFoundException e) {
			e.printStackTrace();
			System.out.println("����� ���� �߻� : " + e.getMessage());
			System.out.println("������ ������ �����ϴ�");
		
		}catch (Exception e) { // FileNotFoundException �̿��� ��� Exception ó��
			System.out.println("�� �� ���� ���� : "+e.getMessage());
		}
		
		
	}
	
	public static String fileDialogOpen() {
		// �ܼ� ��������� �����ϴ� ���α׷� : CLI(Command Line Interface)  <-> GUI(Graphic User Interface) 
		// �ڹٿ����� GUI �� ����� �ִ� Ŭ�������� �ֽ��ϴ�. �� �� �ϳ��� ���ϴ�ȭ���ڸ� ����մϴ�. ���̺귯���� awt,swing,javaFX ���� �ֽ��ϴ�.
		// Windows OS�� ���α׷����� window��� Ʋ �ȿ��� ��������µ� �ڹٿ����� �װ��� �������̶�� �մϴ�.
				
				JFrame f = new JFrame();  //���ϴ�ȭ���ڸ� ������ �����Ӱ�ü ����
				
				FileDialog fdr = new FileDialog(f,"���� ����",FileDialog.LOAD);	//���ϴ�ȭ���� ��ü ����
				fdr.setVisible(true);		//���� ��ȭ���� ���̱�
				
				String filename = fdr.getDirectory() + fdr.getFile(); 	//������ ������ ��ο� ���ϸ� ����
				System.out.println("������ ��ο� ���� : " + filename);
//				System.out.println("������ ��� : " + fdr.getDirectory() + ",������ ����:" + fdr.getFile());
				File file = new File(filename);
				System.out.println("������ ���� ũ�� : " + file.length() + "����Ʈ");
				
	
		return filename;
		
	}
	public static String fileDialogSave() {
		JFrame f = new JFrame(); 
		FileDialog fdw = new FileDialog(f, "���� ����",FileDialog.SAVE);
		fdw.setVisible(true);
		String filename = fdw.getDirectory() + fdw.getFile();
		System.out.println("������ ��ο� ���� : " + filename);

		
		return filename;
		
	}
	

	@Override
	public void close() throws Exception {
		// TODO Auto-generated method stub
		
	}

}
//with - resource Ű���尡 �ƴϰ� ���ҽ��� �ٷ�� (ó���ϴ�) try ��
//try~catch �ڿ����� ����� finally dksTmrh java 7���� ���� �ٸ� ���� ������ �����մϴ�. 
//      �� ������ �������̽��� ���������� ã�ƺ���

//  try - with - resource
//  try ��� �ȿ� �ڿ� �Ҵ��� �ϴ� �ڵ尡 �����ϴ�
//  resource�� �ݴ� close()�޼ҵ� ����
//  ���õ� �������̽��� AutoCloseable �Դϴ�
