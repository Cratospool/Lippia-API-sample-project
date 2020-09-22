package api.config;

import services.*;

public enum EntityConfiguration {

    USER {
        @Override
        public Class<?> getEntityService() {
            return UserService.class;
        }

    },
    RESPONSE_HEADERS {
        @Override
        public Class<?> getEntityService() {
            return ResponseHeadersService.class;
        }
    },
    CATEGORIES {
        @Override
        public Class<?> getEntityService() {
            return CategoriesService.class;
        }

    },
    ANALYSIS {
        @Override
        public Class<?> getEntityService() {
            return AnalysisService.class;
        }

    },
    NEW_RELEASES {
        @Override
        public Class<?> getEntityService() {
            return NewReleasesService.class;
        }

    },
    ARTIST {
        @Override
        public Class<?> getEntityService() {
            return ArtistService.class;
        }

    },
    ERROR {
        @Override
        public Class<?> getEntityService() {
            return ErrorService.class;
        }

    };


    public abstract Class<?> getEntityService();
}
