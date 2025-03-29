/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BpProject2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author fbali
 */
public class Ali_Yilmaz_2121221031_bp2_p2_MalzemeDB {

    private static final String connectionString = "your-url-address";
    private static Connection conn;

    public static boolean AddMaterial(Ali_Yilmaz_2121221031_bp2_p2_Malzemeler malzeme) {

        try {
            conn = DriverManager.getConnection(connectionString);
            String query = "INSERT INTO deneymalzemetakibi_db.tbl_malzeme VALUES (?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement statement = conn.prepareStatement(query);
            statement.setInt(1, malzeme.id);
            statement.setString(2, malzeme.malzeme_adi);
            statement.setString(3, malzeme.malzeme_kategorisi);
            statement.setString(4, malzeme.malzeme_Stok);
            statement.setString(5, malzeme.malzeme_skt);
            statement.setString(6, malzeme.malzeme_tedarikci);
            statement.setString(7, malzeme.malzeme_aciklama);
            statement.executeUpdate();

            conn.close();
            return true;

        } catch (SQLException ex) {
            Logger.getLogger(Ali_Yilmaz_2121221031_bp2_p2_GirisEkrani.class.getName()).log(Level.SEVERE, null, ex);

            return false;
        }

    }

    public static boolean AddUser(Ali_Yilmaz_2121221031_bp2_p2_Users user) {

        try {
            conn = DriverManager.getConnection(connectionString);
            String query = "INSERT INTO deneymalzemetakibi_db.tbl_users VALUES (?, ?, ?, ?)";
            PreparedStatement statement = conn.prepareStatement(query);
            statement.setString(1, user.name_surname);
            statement.setString(2, user.User_Id);
            statement.setString(3, user.password);
            statement.setString(4, user.Position);

            statement.executeUpdate();

            conn.close();
            return true;

        } catch (SQLException ex) {
            Logger.getLogger(Ali_Yilmaz_2121221031_bp2_p2_GirisEkrani.class.getName()).log(Level.SEVERE, null, ex);

            return false;
        }

    }

    public static boolean pullUser(String kullaniciAdi, String sifre) {
        try {
            conn = DriverManager.getConnection(connectionString);
            String query = "SELECT * FROM deneymalzemetakibi_db.tbl_users WHERE User_Id = ? AND password = ?";
            PreparedStatement statement = conn.prepareStatement(query);
            statement.setString(1, kullaniciAdi);
            statement.setString(2, sifre);
            ResultSet rs = statement.executeQuery();

            boolean kullaniciVar = rs.next();

            conn.close();
            return kullaniciVar;
        } catch (SQLException ex) {
            Logger.getLogger(Ali_Yilmaz_2121221031_bp2_p2_GirisEkrani.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    public static boolean AddRequest(Ali_Yilmaz_2121221031_bp2_p2_TalepOlusturma talep) {

        try {
            conn = DriverManager.getConnection(connectionString);
            String query = "INSERT INTO deneymalzemetakibi_db.tbl_talep VALUES (?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement statement = conn.prepareStatement(query);
            statement.setInt(1, talep.TalepId);
            statement.setString(2, talep.MalzemeTalebi);
            statement.setString(3, talep.TalepOnceligi);
            statement.setString(4, talep.TalepMiktarı);
            statement.setString(5, talep.TalepTarihi);
            statement.setString(6, talep.TalepKategorisi);
            statement.setString(7, talep.TalepGerekcesi);

            statement.executeUpdate();

            conn.close();
            return true;

        } catch (SQLException ex) {
            Logger.getLogger(Ali_Yilmaz_2121221031_bp2_p2_GirisEkrani.class.getName()).log(Level.SEVERE, null, ex);

            return false;
        }

    }

    public static ArrayList<Ali_Yilmaz_2121221031_bp2_p2_TalepOlusturma> pullRequest() {
        ArrayList<Ali_Yilmaz_2121221031_bp2_p2_TalepOlusturma> talepler = new ArrayList<>();

        try {
            conn = DriverManager.getConnection(connectionString);
            String query = "SELECT * FROM deneymalzemetakibi_db.tbl_talep";
            Statement statement = conn.createStatement();
            ResultSet rs = statement.executeQuery(query);

            while (rs.next()) {
                Ali_Yilmaz_2121221031_bp2_p2_TalepOlusturma talep = new Ali_Yilmaz_2121221031_bp2_p2_TalepOlusturma();
                talep.TalepId = rs.getInt("Talep Id");
                talep.MalzemeTalebi = rs.getString("Malzeme Talebi");
                talep.TalepOnceligi = rs.getString("Talep Önceliği");
                talep.TalepMiktarı = rs.getString("Talep Miktari");
                talep.TalepTarihi = rs.getString("Talep Tarihi");
                talep.TalepKategorisi = rs.getString("Talep Kategorisi");
                talep.TalepGerekcesi = rs.getString("Talep Gerekçesi");

                talepler.add(talep);
            }

            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(Ali_Yilmaz_2121221031_bp2_p2_GirisEkrani.class.getName()).log(Level.SEVERE, null, ex);
        }

        return talepler;
    }

    public static boolean DeleteRequestById(int id) {
        try {
            conn = DriverManager.getConnection(connectionString);
            String query = "delete from deneymalzemetakibi_db.tbl_talep where `Talep Id`=" + id;

            Statement stmt = conn.createStatement();
            stmt.executeUpdate(query);
            conn.close();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(Ali_Yilmaz_2121221031_bp2_p2_GirisEkrani.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    public static String getUserPosition(String kullaniciAdi, String sifre) {
        try {
            conn = DriverManager.getConnection(connectionString);
            String query = "SELECT Position FROM deneymalzemetakibi_db.tbl_users WHERE User_Id = ? AND password = ?";
            PreparedStatement statement = conn.prepareStatement(query);
            statement.setString(1, kullaniciAdi);
            statement.setString(2, sifre);
            ResultSet rs = statement.executeQuery();

            String position = null;
            if (rs.next()) {
                position = rs.getString("Position");
            }

            conn.close();
            return position;
        } catch (SQLException ex) {
            Logger.getLogger(Ali_Yilmaz_2121221031_bp2_p2_GirisEkrani.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    public static ArrayList<Ali_Yilmaz_2121221031_bp2_p2_Malzemeler> searchByNameOrId(String search) {
        ArrayList<Ali_Yilmaz_2121221031_bp2_p2_Malzemeler> mlist = new ArrayList<>();

        try {
            conn = DriverManager.getConnection(connectionString);
            String query = "SELECT * FROM deneymalzemetakibi_db.tbl_malzeme WHERE malzeme_adi LIKE ? OR id LIKE ?";
            PreparedStatement stmt = conn.prepareStatement(query);
            stmt.setString(1, "%" + search + "%");
            stmt.setString(2, "%" + search + "%");
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                Ali_Yilmaz_2121221031_bp2_p2_Malzemeler nm = new Ali_Yilmaz_2121221031_bp2_p2_Malzemeler();
                nm.id = rs.getInt("id");
                nm.malzeme_adi = rs.getString("malzeme_adi");
                nm.malzeme_kategorisi = rs.getString("malzeme_kategorisi");
                nm.malzeme_Stok = rs.getString("malzeme_Stok");
                nm.malzeme_skt = rs.getString("malzeme_skt");
                nm.malzeme_tedarikci = rs.getString("malzeme_tedarikci");
                nm.malzeme_aciklama = rs.getString("malzeme_aciklama");
                mlist.add(nm);
            }

            conn.close();

        } catch (SQLException ex) {
            Logger.getLogger(Ali_Yilmaz_2121221031_bp2_p2_GirisEkrani.class.getName()).log(Level.SEVERE, null, ex);
        }

        return mlist;
    }

    public static ArrayList<Ali_Yilmaz_2121221031_bp2_p2_TalepOlusturma> searchByNameOrPriority(String search) {
        ArrayList<Ali_Yilmaz_2121221031_bp2_p2_TalepOlusturma> mlist = new ArrayList<>();

        try {
            conn = DriverManager.getConnection(connectionString);
            String query = "SELECT * FROM deneymalzemetakibi_db.tbl_talep WHERE `Malzeme Talebi` LIKE ? OR `Talep Önceliği` LIKE ?";
            PreparedStatement stmt = conn.prepareStatement(query);
            stmt.setString(1, "%" + search + "%");
            stmt.setString(2, "%" + search + "%");
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                Ali_Yilmaz_2121221031_bp2_p2_TalepOlusturma talep = new Ali_Yilmaz_2121221031_bp2_p2_TalepOlusturma();
                talep.TalepId = rs.getInt("Talep Id");
                talep.MalzemeTalebi = rs.getString("Malzeme Talebi");
                talep.TalepOnceligi = rs.getString("Talep Önceliği");
                talep.TalepMiktarı = rs.getString("Talep Miktarı");
                talep.TalepTarihi = rs.getString("Talep Tarihi");
                talep.TalepKategorisi = rs.getString("Talep Kategorisi");
                talep.TalepGerekcesi = rs.getString("Talep Gerekçesi");
                mlist.add(talep);
            }

            conn.close();

        } catch (SQLException ex) {
            Logger.getLogger(Ali_Yilmaz_2121221031_bp2_p2_GirisEkrani.class.getName()).log(Level.SEVERE, null, ex);
        }

        return mlist;
    }

    public static boolean DeleteById(int id) {

        try {
            conn = DriverManager.getConnection(connectionString);
            String query = "delete from deneymalzemetakibi_db.tbl_malzeme where id=" + id;

            Statement stmt = conn.createStatement();
            stmt.executeUpdate(query);
            conn.close();
            return true;

        } catch (SQLException ex) {
            Logger.getLogger(Ali_Yilmaz_2121221031_bp2_p2_GirisEkrani.class.getName()).log(Level.SEVERE, null, ex);

            return false;
        }

    }

    public static boolean UpdateMaterial(Ali_Yilmaz_2121221031_bp2_p2_Malzemeler nm) {

        try {
            conn = DriverManager.getConnection(connectionString);
            String query = "UPDATE deneymalzemetakibi_db.tbl_malzeme SET "
                    + "malzeme_adi = ?, "
                    + "malzeme_kategorisi = ?, "
                    + "malzeme_Stok = ?, "
                    + "malzeme_skt = ?, "
                    + "malzeme_tedarikci = ?, "
                    + "malzeme_aciklama = ? "
                    + "WHERE id = ?";

            PreparedStatement stmt = conn.prepareStatement(query);
            stmt.setString(1, nm.malzeme_adi);
            stmt.setString(2, nm.malzeme_kategorisi);
            stmt.setString(3, nm.malzeme_Stok);
            stmt.setString(4, nm.malzeme_skt);
            stmt.setString(5, nm.malzeme_tedarikci);
            stmt.setString(6, nm.malzeme_aciklama);
            stmt.setInt(7, nm.id);

            stmt.executeUpdate();
            conn.close();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(Ali_Yilmaz_2121221031_bp2_p2_GirisEkrani.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }

    }
public static boolean UpdateRequest(Ali_Yilmaz_2121221031_bp2_p2_TalepOlusturma talep) {
    try {
        conn = DriverManager.getConnection(connectionString);
       String query = "UPDATE deneymalzemetakibi_db.tbl_talep SET "
                + "`Malzeme Talebi` = ?, "
                + "`Talep Önceliği` = ?, "
                + "`Talep Miktarı` = ?, "
                + "`Talep Tarihi` = ?, "
                + "`Talep Kategorisi` = ?, "
                + "`Talep Gerekçesi` = ? "
                + "WHERE `Talep Id` = ?";

        PreparedStatement stmt = conn.prepareStatement(query);
        stmt.setString(1, talep.MalzemeTalebi);
        stmt.setString(2, talep.TalepOnceligi);
        stmt.setString(3, talep.TalepMiktarı);
        stmt.setString(4, talep.TalepTarihi);
        stmt.setString(5, talep.TalepKategorisi);
        stmt.setString(6, talep.TalepGerekcesi);
        stmt.setInt(7, talep.TalepId);

        stmt.executeUpdate();
        conn.close();
        return true;
    } catch (SQLException ex) {
        Logger.getLogger(Ali_Yilmaz_2121221031_bp2_p2_GirisEkrani.class.getName()).log(Level.SEVERE, null, ex);
        return false;
    }
}


    public static ArrayList<Ali_Yilmaz_2121221031_bp2_p2_Malzemeler> getMaterials() {
        ArrayList<Ali_Yilmaz_2121221031_bp2_p2_Malzemeler> malzemeler = new ArrayList<>();

        try {
            Connection conn = DriverManager.getConnection(connectionString);
            String query = "SELECT * FROM tbl_malzeme";
            PreparedStatement statement = conn.prepareStatement(query);
            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {
                Ali_Yilmaz_2121221031_bp2_p2_Malzemeler malzeme = new Ali_Yilmaz_2121221031_bp2_p2_Malzemeler();
                malzeme.id = resultSet.getInt("id");
                malzeme.malzeme_adi = resultSet.getString("malzeme_adi");
                malzeme.malzeme_kategorisi = resultSet.getString("malzeme_kategorisi");
                malzeme.malzeme_Stok = resultSet.getString("malzeme_Stok");
                malzeme.malzeme_skt = resultSet.getString("malzeme_skt");
                malzeme.malzeme_tedarikci = resultSet.getString("malzeme_tedarikci");
                malzeme.malzeme_aciklama = resultSet.getString("malzeme_aciklama");
                malzemeler.add(malzeme);
            }

            conn.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        return malzemeler;
    }

    public static Ali_Yilmaz_2121221031_bp2_p2_Malzemeler getMaterialById(int id) {
        try {
            conn = DriverManager.getConnection(connectionString);
            String query = "SELECT * FROM tbl_malzeme WHERE id = ?";
            PreparedStatement stmt = conn.prepareStatement(query);
            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                Ali_Yilmaz_2121221031_bp2_p2_Malzemeler malzeme = new Ali_Yilmaz_2121221031_bp2_p2_Malzemeler();
                malzeme.setId(rs.getInt("id"));
                malzeme.setMalzeme_adi(rs.getString("malzeme_adi"));
                malzeme.setMalzeme_kategorisi(rs.getString("malzeme_kategorisi"));
                malzeme.setMalzeme_Stok(rs.getString("malzeme_Stok"));
                malzeme.setMalzeme_skt(rs.getString("malzeme_skt"));
                malzeme.setMalzeme_tedarikci(rs.getString("malzeme_tedarikci"));
                malzeme.setMalzeme_aciklama(rs.getString("malzeme_aciklama"));

                conn.close();
                return malzeme;
            }

            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(Ali_Yilmaz_2121221031_bp2_p2_GirisEkrani.class.getName()).log(Level.SEVERE, null, ex);
        }

        return null;
    }
 public static Ali_Yilmaz_2121221031_bp2_p2_TalepOlusturma getRequestById(int talepId) {
    Ali_Yilmaz_2121221031_bp2_p2_TalepOlusturma talep = null;

    try {
        conn = DriverManager.getConnection(connectionString);
        String query = "SELECT * FROM deneymalzemetakibi_db.tbl_talep WHERE `Talep Id` = ?";
        PreparedStatement stmt = conn.prepareStatement(query);
        stmt.setInt(1, talepId);
        ResultSet rs = stmt.executeQuery();

        if (rs.next()) {
            talep = new Ali_Yilmaz_2121221031_bp2_p2_TalepOlusturma();
            talep.setTalepId(rs.getInt("Talep Id"));
            talep.setMalzemeTalebi(rs.getString("Malzeme Talebi"));
            talep.setTalepOnceligi(rs.getString("Talep Önceliği"));
            talep.setTalepMiktarı(rs.getString("Talep Miktari"));
            talep.setTalepTarihi(rs.getString("Talep Tarihi"));
            talep.setTalepKategorisi(rs.getString("Talep Kategorisi"));
            talep.setTalepGerekcesi(rs.getString("Talep Gerekçesi"));
        }

        conn.close();
    } catch (SQLException ex) {
        Logger.getLogger(Ali_Yilmaz_2121221031_bp2_p2_GirisEkrani.class.getName()).log(Level.SEVERE, null, ex);
    }

    return talep;
}



}
