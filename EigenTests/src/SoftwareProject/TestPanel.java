package SoftwareProject;

import javax.swing.JPanel;
import javax.swing.SpringLayout;
import java.awt.GridLayout;
import java.awt.SystemColor;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JLabel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.CardLayout;
import java.awt.FlowLayout;
import javax.swing.BoxLayout;
import java.awt.Component;
import javax.swing.border.CompoundBorder;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.border.MatteBorder;
import java.awt.BorderLayout;

public class TestPanel extends JPanel {

	/**
	 * Create the panel.
	 */
	public TestPanel() {
		setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(51, 255, 0)));
		setBackground(SystemColor.window);;
		setLayout(new BorderLayout(0, 0));
		
		JPanel panel_4 = new JPanel();
		panel_4.setBorder(new LineBorder(new Color(204, 0, 51)));
		add(panel_4, BorderLayout.NORTH);
		GridBagLayout gbl_panel_4 = new GridBagLayout();
		gbl_panel_4.columnWidths = new int[] {100};
		gbl_panel_4.rowHeights = new int[] {100, 100, 100, 100};
		gbl_panel_4.columnWeights = new double[]{1.0};
		gbl_panel_4.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0};
		panel_4.setLayout(gbl_panel_4);
		
		JPanel panel = new JPanel();
		GridBagConstraints gbc_panel = new GridBagConstraints();
		gbc_panel.insets = new Insets(5, 5, 5, 5);
		gbc_panel.fill = GridBagConstraints.HORIZONTAL;
		gbc_panel.anchor = GridBagConstraints.NORTH;
		gbc_panel.gridx = 0;
		gbc_panel.gridy = 0;
		panel_4.add(panel, gbc_panel);
		FlowLayout flowLayout = (FlowLayout) panel.getLayout();
		flowLayout.setVgap(50);
		panel.setBackground(SystemColor.inactiveCaption);
		panel.setForeground(SystemColor.textHighlight);
		
		JPanel panel_1 = new JPanel();
		GridBagConstraints gbc_panel_1 = new GridBagConstraints();
		gbc_panel_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_panel_1.anchor = GridBagConstraints.NORTH;
		gbc_panel_1.insets = new Insets(5, 5, 5, 5);
		gbc_panel_1.gridx = 0;
		gbc_panel_1.gridy = 1;
		panel_4.add(panel_1, gbc_panel_1);
		FlowLayout flowLayout_1 = (FlowLayout) panel_1.getLayout();
		flowLayout_1.setVgap(50);
		panel_1.setBackground(SystemColor.activeCaption);
		
		JPanel panel_2 = new JPanel();
		panel_2.setForeground(SystemColor.inactiveCaption);
		GridBagConstraints gbc_panel_2 = new GridBagConstraints();
		gbc_panel_2.fill = GridBagConstraints.HORIZONTAL;
		gbc_panel_2.anchor = GridBagConstraints.NORTH;
		gbc_panel_2.insets = new Insets(5, 5, 5, 5);
		gbc_panel_2.gridx = 0;
		gbc_panel_2.gridy = 2;
		panel_4.add(panel_2, gbc_panel_2);
		FlowLayout flowLayout_2 = (FlowLayout) panel_2.getLayout();
		flowLayout_2.setVgap(50);
		panel_2.setBackground(SystemColor.textHighlight);
		
		JPanel panel_3 = new JPanel();
		GridBagConstraints gbc_panel_3 = new GridBagConstraints();
		gbc_panel_3.fill = GridBagConstraints.HORIZONTAL;
		gbc_panel_3.anchor = GridBagConstraints.NORTH;
		gbc_panel_3.insets = new Insets(5, 5, 5, 5);
		gbc_panel_3.gridx = 0;
		gbc_panel_3.gridy = 3;
		panel_4.add(panel_3, gbc_panel_3);
		FlowLayout flowLayout_3 = (FlowLayout) panel_3.getLayout();
		flowLayout_3.setVgap(50);
		panel_3.setBackground(SystemColor.windowBorder);

	}

}
