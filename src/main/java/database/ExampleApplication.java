package database;

import io.dropwizard.*;
import io.dropwizard.db.DataSourceFactory;
import io.dropwizard.jdbi3.JdbiFactory;
import io.dropwizard.setup.Environment;
import org.jdbi.v3.core.Jdbi;


public class ExampleApplication extends Application<ExampleConfiguration>  {
    @Override
    public void run(ExampleConfiguration config, Environment environment) throws Exception
    {
        final JdbiFactory factory = new JdbiFactory();

        final String password = System.getenv("DB_PASS");
        DataSourceFactory database = config.getDb();
        database.setPassword(password);

        final Jdbi jdbi = factory.build(environment, database, "postgresql");
        myDAO dao = jdbi.onDemand(myDAO.class);
        environment.jersey().register(new ExampleResource(dao));

    }

    public static void main(String[] args) throws Exception
    {
        new ExampleApplication().run(args);
    }
}
