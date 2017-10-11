package Task;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.io.File;

/**
 * Created by Mosen on 2017/9/21.
 */
@Component
public class NfsStatus {
    //nfs连接是否可用
    private Boolean nfsConn1 = true;
    private Boolean nfsConn2 = true;
    private Boolean nfsConn3 = true;

    private String nfsPath1;

    private String nfsPath2;

    private String nfsPath3;
    //取不到nfs_testFile时默认值为nfsTest
    @Value("${nfs_testFile:nfsTest}")
    private String nfsTestFile;

    public Boolean getNfsConn1() {
        return nfsConn1;
    }

    public void setNfsConn1(Boolean nfsConn1) {
        this.nfsConn1 = nfsConn1;
    }

    public Boolean getNfsConn2() {
        return nfsConn2;
    }

    public void setNfsConn2(Boolean nfsConn2) {
        this.nfsConn2 = nfsConn2;
    }

    public Boolean getNfsConn3() {
        return nfsConn3;
    }

    public void setNfsConn3(Boolean nfsConn3) {
        this.nfsConn3 = nfsConn3;
    }

    public String getNfsPath1() {
        return nfsPath1;
    }

    @Value("${nfs_path1:}")
    public void setNfsPath1(String nfsPath1) {
        if (nfsPath1.endsWith(File.separator)) {
            this.nfsPath1 = nfsPath1.substring(0,nfsPath1.length()-1);
        } else {
            this.nfsPath1 = nfsPath1;
        }
    }

    public String getNfsPath2() {
        return nfsPath2;
    }

    @Value("${nfs_path2:}")
    public void setNfsPath2(String nfsPath2) {
        if (nfsPath2.endsWith(File.separator)) {
            this.nfsPath2 = nfsPath2.substring(0,nfsPath2.length()-1);
        } else {
            this.nfsPath2 = nfsPath2;
        }
    }

    public String getNfsPath3() {
        return nfsPath3;
    }

    @Value("${nfs_path3:}")
    public void setNfsPath3(String nfsPath3) {
        if (nfsPath3.endsWith(File.separator)) {
            this.nfsPath3 = nfsPath3.substring(0,nfsPath3.length()-1);
        } else {
            this.nfsPath3 = nfsPath3;
        }
    }

    public String getNfsTestFile() {
        return nfsTestFile;
    }

    public void setNfsTestFile(String nfsTestFile) {
        this.nfsTestFile = nfsTestFile;
    }
}
