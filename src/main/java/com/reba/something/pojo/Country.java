package com.reba.something.pojo;

import com.reba.something.visitor.CountryVisitor;

public enum Country {

    AR {
        @Override
        public <T> T accept(final CountryVisitor<T> visitor) {
            return visitor.visitArgentina();
        }
    },

    BR {
        @Override
        public <T> T accept(final CountryVisitor<T> visitor) {
            return visitor.visitBrazil();
        }
    },

    IT {
        @Override
        public <T> T accept(final CountryVisitor<T> visitor) {
            return visitor.visitItaly();
        }
    };

    public abstract <T> T accept(final CountryVisitor<T> visitor);

}