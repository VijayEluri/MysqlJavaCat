/*
 * MysqlJavaCatAboutBox.java
 */

package mysqljavacat.dialogs;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import mysqljavacat.MysqlJavaCatApp;
import org.jdesktop.application.Action;
import org.jdesktop.application.Task;

public class MysqlJavaCatAboutBox extends javax.swing.JDialog {
    
    public MysqlJavaCatAboutBox(java.awt.Frame parent) {
        super(parent);
        initComponents();        
        getRootPane().setDefaultButton(closeButton);        
    }

    @Action public void closeAboutBox() {
        dispose();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        closeButton = new javax.swing.JButton();
        javax.swing.JLabel appTitleLabel = new javax.swing.JLabel();
        javax.swing.JLabel versionLabel = new javax.swing.JLabel();
        appVersionLabel = new javax.swing.JLabel();
        javax.swing.JLabel vendorLabel = new javax.swing.JLabel();
        javax.swing.JLabel appVendorLabel = new javax.swing.JLabel();
        javax.swing.JLabel homepageLabel = new javax.swing.JLabel();
        javax.swing.JLabel appHomepageLabel = new javax.swing.JLabel();
        javax.swing.JLabel imageLabel = new javax.swing.JLabel();
        upgradeButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        org.jdesktop.application.ResourceMap resourceMap = org.jdesktop.application.Application.getInstance(mysqljavacat.MysqlJavaCatApp.class).getContext().getResourceMap(MysqlJavaCatAboutBox.class);
        setTitle(resourceMap.getString("title")); // NOI18N
        setModal(true);
        setName("aboutBox"); // NOI18N
        setResizable(false);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                checkVersion(evt);
            }
        });

        javax.swing.ActionMap actionMap = org.jdesktop.application.Application.getInstance(mysqljavacat.MysqlJavaCatApp.class).getContext().getActionMap(MysqlJavaCatAboutBox.class, this);
        closeButton.setAction(actionMap.get("closeAboutBox")); // NOI18N
        closeButton.setName("closeButton"); // NOI18N

        appTitleLabel.setFont(appTitleLabel.getFont().deriveFont(appTitleLabel.getFont().getStyle() | java.awt.Font.BOLD, appTitleLabel.getFont().getSize()+4));
        appTitleLabel.setText(resourceMap.getString("Application.title")); // NOI18N
        appTitleLabel.setName("appTitleLabel"); // NOI18N

        versionLabel.setFont(versionLabel.getFont().deriveFont(versionLabel.getFont().getStyle() | java.awt.Font.BOLD));
        versionLabel.setText(resourceMap.getString("versionLabel.text")); // NOI18N
        versionLabel.setName("versionLabel"); // NOI18N

        appVersionLabel.setText(resourceMap.getString("Application.version")); // NOI18N
        appVersionLabel.setName("appVersionLabel"); // NOI18N

        vendorLabel.setFont(vendorLabel.getFont().deriveFont(vendorLabel.getFont().getStyle() | java.awt.Font.BOLD));
        vendorLabel.setText(resourceMap.getString("vendorLabel.text")); // NOI18N
        vendorLabel.setName("vendorLabel"); // NOI18N

        appVendorLabel.setText(resourceMap.getString("Application.vendor")); // NOI18N
        appVendorLabel.setName("appVendorLabel"); // NOI18N

        homepageLabel.setFont(homepageLabel.getFont().deriveFont(homepageLabel.getFont().getStyle() | java.awt.Font.BOLD));
        homepageLabel.setText(resourceMap.getString("homepageLabel.text")); // NOI18N
        homepageLabel.setName("homepageLabel"); // NOI18N

        appHomepageLabel.setText(resourceMap.getString("Application.homepage")); // NOI18N
        appHomepageLabel.setName("appHomepageLabel"); // NOI18N

        imageLabel.setIcon(resourceMap.getIcon("imageLabel.icon")); // NOI18N
        imageLabel.setMaximumSize(null);
        imageLabel.setMinimumSize(null);
        imageLabel.setName("imageLabel"); // NOI18N
        imageLabel.setPreferredSize(null);

        upgradeButton.setAction(actionMap.get("update")); // NOI18N
        upgradeButton.setText(resourceMap.getString("upgradeButton.text")); // NOI18N
        upgradeButton.setName("upgradeButton"); // NOI18N

        jLabel1.setText(resourceMap.getString("jLabel1.text")); // NOI18N
        jLabel1.setName("jLabel1"); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(imageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(closeButton, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(appTitleLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(upgradeButton, javax.swing.GroupLayout.DEFAULT_SIZE, 206, Short.MAX_VALUE)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(versionLabel)
                                .addComponent(vendorLabel)
                                .addComponent(homepageLabel))
                            .addGap(34, 34, 34)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(appVersionLabel)
                                .addComponent(appVendorLabel)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addComponent(appHomepageLabel)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(appTitleLabel)
                        .addGap(46, 46, 46)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(versionLabel)
                            .addComponent(appVersionLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(vendorLabel)
                            .addComponent(appVendorLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(homepageLabel)
                        .addGap(39, 39, 39)
                        .addComponent(upgradeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(closeButton))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(128, 128, 128)
                        .addComponent(appHomepageLabel))
                    .addComponent(imageLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 389, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

private void checkVersion(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_checkVersion
        MysqlJavaCatApp app = MysqlJavaCatApp.getApplication(); 
        appVersionLabel.setText(app.VERSION);
        upgradeButton.setVisible(false);
        Task queryTask = new Task(app) {
            @Override
            protected Object doInBackground() throws Exception {
                String version = "";
                try {
                    URL check_version;
                    check_version = new URL("https://raw.github.com/strelok1111/MysqlJavaCat/master/VERSION");

                    URLConnection yc = check_version.openConnection();
                    BufferedReader in = new BufferedReader(new InputStreamReader(yc.getInputStream()));

                    String inputLine;
                    if ((inputLine = in.readLine()) != null)
                        version = inputLine;
                    in.close();
                }catch(Exception e){
                }
                if(!MysqlJavaCatApp.getApplication().VERSION.equals(version)){
                     upgradeButton.setVisible(true);
                }
                return null;
            }
        };
      
        app.getContext().getTaskService().execute(queryTask);
        app.getContext().getTaskMonitor().setForegroundTask(queryTask);
}//GEN-LAST:event_checkVersion

    @Action
    public void update() {
        
        MysqlJavaCatApp app = MysqlJavaCatApp.getApplication();
        Task queryTask = new Task(app) {
            @Override
            protected Object doInBackground() throws Exception {
                String version = "";
                try {
                    String url = "";
                    String tempfile = "";
                    String currentOs = System.getProperty("os.name").toUpperCase();
                    if(currentOs.equals("LINUX")){
                        url = "https://github.com/strelok1111/MysqlJavaCat/raw/master/MysqlJavaCat.deb";
                        tempfile = System.getProperty("java.io.tmpdir") + "/MysqlJavaCat.deb";
                    }else if(currentOs.equals("WINDOWS")){
                        url = "https://github.com/strelok1111/MysqlJavaCat/raw/master/Win/mysqljavacat.msi";
                        tempfile = System.getProperty("java.io.tmpdir") + "\\mysqljavacat.msi"; 
                    }
                    
                    URL check_version;
                    check_version = new URL(url);
                    
                    BufferedInputStream in = new BufferedInputStream(check_version.openStream());
                    FileOutputStream fos = new java.io.FileOutputStream(tempfile);
                    BufferedOutputStream bout = new BufferedOutputStream(fos,1024);
                    byte data[] = new byte[1024];
                    int count;
                    int countAll = 0;                    
                    while( (count = in.read(data, 0, 1024)) != -1){
                        bout.write(data,0,count);
                        countAll = countAll + count;
                        jLabel1.setText("Downloaded " + countAll + " bytes");                        
                    }
                    bout.close();
                    in.close();
                    
                    Runtime run = Runtime.getRuntime();
                    if(currentOs.equals("LINUX")){
                        run.exec("gksudo dpkg -i " + tempfile);                    
                        run.exec("rm " + tempfile);
                    }else if(currentOs.equals("WINDOWS")){
                        run.exec("start /B msiexec /i " + tempfile);
                    }
                }catch(Exception e){
                }
                
                return null;
            }
        };
      
        app.getContext().getTaskService().execute(queryTask);
        app.getContext().getTaskMonitor().setForegroundTask(queryTask);
    }

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel appVersionLabel;
    private javax.swing.JButton closeButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton upgradeButton;
    // End of variables declaration//GEN-END:variables
    
}
