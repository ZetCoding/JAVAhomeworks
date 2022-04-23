package Model.Entity;

public class Entity {

        private String username,password;
        private long id;
        private long hajm;
        private String price;
        private long myHajm;
        private long attempts;

        public long getId () {
        return id;
        }

        public Entity setId (long id) {
        this.id = id;
        return this;
        }

        public String getUsername () {
            return username;
        }

        public Entity setUsername (String username) {
            this.username = username;
            return this;
        }

        public String getPassword () {
            return password;
        }

        public Entity setPassword (String password) {
            this.password = password;
            return this;
        }

        public long getHajm () {
            return hajm;
        }

        public Entity setHajm (long hajm) {
            this.hajm = hajm;
            return this;
        }

    public String getPrice () {
        return price;
    }

    public Entity setPrice (String price) {
        this.price = price;
        return this;
    }

    public long getMyHajm () {
        return myHajm;
    }

    public Entity setMyHajm (long myHajm) {
        this.myHajm = myHajm;
        return this;
    }

    public long getAttempts () {
        return attempts;
    }

    public Entity setAttempts (long attempts) {
        this.attempts = attempts;
        return this;
    }

}
