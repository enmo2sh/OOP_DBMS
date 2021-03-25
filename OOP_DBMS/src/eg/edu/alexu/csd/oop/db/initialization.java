package eg.edu.alexu.csd.oop.db;

public class initialization {
    Facade facade = new Facade();

    initialization(){
        facade.path.setdefaultDB("");
        facade.path.setPath("");
        facade.Tables.SetDefaultTable("");
        facade.Tables.clearTables();
    }
}
