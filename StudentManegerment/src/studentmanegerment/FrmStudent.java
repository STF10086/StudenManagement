package studentmanegerment;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.SWT;
import org.eclipse.wb.swt.SWTResourceManager;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;

public class FrmStudent {

	protected Shell shell;
	private Text text;
	private Text text_1;
	private Text text_2;
	private Table table;

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			FrmStudent window = new FrmStudent();
			window.open();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Open the window.
	 */
	public void open() {
		Display display = Display.getDefault();
		createContents();
		shell.open();
		shell.layout();
		while (!shell.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}

	/**
	 * Create contents of the window.
	 */
	protected void createContents() {
		shell = new Shell();
		shell.setSize(710, 509);
		shell.setText("SWT Application");
		
		Label lblNewLabel = new Label(shell, SWT.NONE);
		lblNewLabel.setFont(SWTResourceManager.getFont("Segoe UI", 18, SWT.NORMAL));
		lblNewLabel.setAlignment(SWT.CENTER);
		lblNewLabel.setForeground(SWTResourceManager.getColor(SWT.COLOR_BLUE));
		lblNewLabel.setBounds(201, 10, 286, 51);
		lblNewLabel.setText("Student Management");
		
		Label lblNewLabel_1 = new Label(shell, SWT.NONE);
		lblNewLabel_1.setForeground(SWTResourceManager.getColor(SWT.COLOR_BLUE));
		lblNewLabel_1.setBounds(73, 75, 55, 30);
		lblNewLabel_1.setText("MSSV:");
		
		Label lblHTn = new Label(shell, SWT.NONE);
		lblHTn.setForeground(SWTResourceManager.getColor(SWT.COLOR_BLUE));
		lblHTn.setText("Họ tên");
		lblHTn.setBounds(73, 111, 60, 30);
		
		Label lblGiiTnh = new Label(shell, SWT.NONE);
		lblGiiTnh.setForeground(SWTResourceManager.getColor(SWT.COLOR_BLUE));
		lblGiiTnh.setText("Giới tính:");
		lblGiiTnh.setBounds(73, 147, 60, 30);
		
		Label lblEmail = new Label(shell, SWT.NONE);
		lblEmail.setForeground(SWTResourceManager.getColor(SWT.COLOR_BLUE));
		lblEmail.setText("Email");
		lblEmail.setBounds(73, 183, 60, 30);
		
		text = new Text(shell, SWT.BORDER);
		text.setBounds(146, 67, 103, 25);
		
		text_1 = new Text(shell, SWT.BORDER);
		text_1.setBounds(146, 105, 183, 25);
		
		text_2 = new Text(shell, SWT.BORDER);
		text_2.setBounds(146, 175, 183, 25);
		
		Combo combo = new Combo(shell, SWT.NONE);
		combo.setBounds(146, 142, 91, 25);
		
		table = new Table(shell, SWT.BORDER | SWT.FULL_SELECTION);
		table.setBounds(73, 258, 486, 170);
		table.setHeaderVisible(true);
		table.setLinesVisible(true);
		
		TableColumn tblclmnMssv = new TableColumn(table, SWT.CENTER);
		tblclmnMssv.setWidth(120);
		tblclmnMssv.setText("MSSV");
		
		TableColumn tblclmnHTn = new TableColumn(table, SWT.NONE);
		tblclmnHTn.setWidth(120);
		tblclmnHTn.setText("Họ tên");
		
		TableColumn tblclmnGiiTnh = new TableColumn(table, SWT.NONE);
		tblclmnGiiTnh.setWidth(120);
		tblclmnGiiTnh.setText("Giới tính");
		
		TableColumn tblclmnEmail = new TableColumn(table, SWT.NONE);
		tblclmnEmail.setWidth(120);
		tblclmnEmail.setText("Email");
		
		Label lblListStudent = new Label(shell, SWT.NONE);
		lblListStudent.setBounds(73, 237, 55, 15);
		lblListStudent.setText("List Student");

	}
}
