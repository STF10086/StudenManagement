package studentmanegerment;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.SWT;
import org.eclipse.wb.swt.SWTResourceManager;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.DateTime;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.ToolBar;
import org.eclipse.swt.widgets.TabFolder;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Tree;
import org.eclipse.swt.widgets.List;
import org.eclipse.jface.viewers.ListViewer;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.CheckboxTableViewer;
import org.eclipse.jface.viewers.ComboViewer;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.custom.ViewForm;

public class FrmStudent {

	protected Shell shlFrmapp;
	private Text text;
	private Text text_1;
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
		shlFrmapp.open();
		shlFrmapp.layout();
		while (!shlFrmapp.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}

	/**
	 * Create contents of the window.
	 */
	protected void createContents() {
		shlFrmapp = new Shell();
		shlFrmapp.setSize(648, 379);
		shlFrmapp.setText("FrmApp");
		shlFrmapp.setLayout(null);
		
		Label lblStudentmanagerment = new Label(shlFrmapp, SWT.NONE);
		lblStudentmanagerment.setFont(SWTResourceManager.getFont("Segoe UI", 16, SWT.NORMAL));
		lblStudentmanagerment.setForeground(SWTResourceManager.getColor(SWT.COLOR_RED));
		lblStudentmanagerment.setAlignment(SWT.CENTER);
		lblStudentmanagerment.setBounds(209, 10, 244, 41);
		lblStudentmanagerment.setText("StudentManagerment");
		
		Label lblHVTn = new Label(shlFrmapp, SWT.NONE);
		lblHVTn.setForeground(SWTResourceManager.getColor(SWT.COLOR_BLUE));
		lblHVTn.setBounds(37, 89, 55, 21);
		lblHVTn.setText("H\u1ECD v\u00E0 t\u00EAn:");
		
		Label lblMssv = new Label(shlFrmapp, SWT.SHADOW_IN | SWT.CENTER);
		lblMssv.setForeground(SWTResourceManager.getColor(SWT.COLOR_BLUE));
		lblMssv.setAlignment(SWT.LEFT);
		lblMssv.setBounds(37, 60, 55, 21);
		lblMssv.setText("MSSV:");
		
		text = new Text(shlFrmapp, SWT.BORDER);
		text.setBounds(109, 57, 104, 21);
		
		text_1 = new Text(shlFrmapp, SWT.BORDER);
		text_1.setBounds(109, 86, 207, 21);
		
		Label lblNgySinh = new Label(shlFrmapp, SWT.NONE);
		lblNgySinh.setForeground(SWTResourceManager.getColor(SWT.COLOR_BLUE));
		lblNgySinh.setBounds(356, 89, 68, 21);
		lblNgySinh.setText("Ng\u00E0y Sinh:");
		
		DateTime dateTime = new DateTime(shlFrmapp, SWT.BORDER);
		dateTime.setBounds(450, 86, 129, 24);
		
		Label lblGiiTnh = new Label(shlFrmapp, SWT.NONE);
		lblGiiTnh.setForeground(SWTResourceManager.getColor(SWT.COLOR_BLUE));
		lblGiiTnh.setBounds(37, 115, 68, 21);
		lblGiiTnh.setText("Gi\u1EDBi t\u00EDnh:");
		
		Button btnRadioButton = new Button(shlFrmapp, SWT.RADIO);
		btnRadioButton.setBounds(167, 114, 55, 16);
		btnRadioButton.setText("N\u1EEF");
		
		Button btnNam = new Button(shlFrmapp, SWT.RADIO);
		btnNam.setBounds(109, 113, 55, 16);
		btnNam.setText("Nam");
		
		table = new Table(shlFrmapp, SWT.BORDER | SWT.FULL_SELECTION);
		table.setBounds(37, 161, 542, 150);
		table.setHeaderVisible(true);
		table.setLinesVisible(true);
		
		TableColumn tblclmnNewColumn_1 = new TableColumn(table, SWT.CENTER);
		tblclmnNewColumn_1.setWidth(134);
		tblclmnNewColumn_1.setText("MSSV");
		
		TableColumn tblclmnNewColumn = new TableColumn(table, SWT.NONE);
		tblclmnNewColumn.setWidth(134);
		tblclmnNewColumn.setText("H\u1ECD v\u00E0 t\u00EAn");
		
		TableColumn tblclmnNewColumn_2 = new TableColumn(table, SWT.CENTER);
		tblclmnNewColumn_2.setWidth(134);
		tblclmnNewColumn_2.setText("Ng\u00E0y Sinh");
		
		TableColumn tblclmnNewColumn_3 = new TableColumn(table, SWT.CENTER);
		tblclmnNewColumn_3.setWidth(134);
		tblclmnNewColumn_3.setText("Gi\u1EDBi t\u00EDnh");

	}
}
