package com.khamvongsa.victor.poc_googlemapapp.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by <Victor Khamvongsa> on <11/05/2022>
 */
public class NearbyRestaurant {

    @SerializedName("html_attributions")
    @Expose
    private List<Object> htmlAttributions = null;
    @SerializedName("results")
    @Expose
    private List<PlaceResults> mPlaceResults = null;
    @SerializedName("status")
    @Expose
    private String status;

    public List<Object> getHtmlAttributions() {
        return htmlAttributions;
    }

    public void setHtmlAttributions(List<Object> htmlAttributions) {
        this.htmlAttributions = htmlAttributions;
    }

    public List<PlaceResults> getPlaceResults() {
        return mPlaceResults;
    }

    public void setPlaceResults(List<PlaceResults> placeResults) {
        this.mPlaceResults = placeResults;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public static class PlaceResults {

        @SerializedName("business_status")
        @Expose
        private String businessStatus;
        @SerializedName("geometry")
        @Expose
        private Geometry geometry;
        @SerializedName("icon")
        @Expose
        private String icon;
        @SerializedName("icon_background_color")
        @Expose
        private String iconBackgroundColor;
        @SerializedName("icon_mask_base_uri")
        @Expose
        private String iconMaskBaseUri;
        @SerializedName("name")
        @Expose
        private String name;
        @SerializedName("place_id")
        @Expose
        private String placeId;
        @SerializedName("plus_code")
        @Expose
        private PlusCode plusCode;
        @SerializedName("reference")
        @Expose
        private String reference;
        @SerializedName("scope")
        @Expose
        private String scope;
        @SerializedName("types")
        @Expose
        private List<String> types = null;
        @SerializedName("vicinity")
        @Expose
        private String vicinity;
        @SerializedName("opening_hours")
        @Expose
        private OpeningHours openingHours;
        @SerializedName("photos")
        @Expose
        private List<Photo> photos = null;
        @SerializedName("rating")
        @Expose
        private Double rating;
        @SerializedName("user_ratings_total")
        @Expose
        private Double userRatingsTotal;
        @SerializedName("permanently_closed")
        @Expose
        private Boolean permanentlyClosed;
        @SerializedName("price_level")
        @Expose
        private Integer priceLevel;

        public String getBusinessStatus() {
            return businessStatus;
        }

        public void setBusinessStatus(String businessStatus) {
            this.businessStatus = businessStatus;
        }

        public Geometry getGeometry() {
            return geometry;
        }

        public void setGeometry(Geometry geometry) {
            this.geometry = geometry;
        }

        public String getIcon() {
            return icon;
        }

        public void setIcon(String icon) {
            this.icon = icon;
        }

        public String getIconBackgroundColor() {
            return iconBackgroundColor;
        }

        public void setIconBackgroundColor(String iconBackgroundColor) {
            this.iconBackgroundColor = iconBackgroundColor;
        }

        public String getIconMaskBaseUri() {
            return iconMaskBaseUri;
        }

        public void setIconMaskBaseUri(String iconMaskBaseUri) {
            this.iconMaskBaseUri = iconMaskBaseUri;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getPlaceId() {
            return placeId;
        }

        public void setPlaceId(String placeId) {
            this.placeId = placeId;
        }

        public PlusCode getPlusCode() {
            return plusCode;
        }

        public void setPlusCode(PlusCode plusCode) {
            this.plusCode = plusCode;
        }

        public String getReference() {
            return reference;
        }

        public void setReference(String reference) {
            this.reference = reference;
        }

        public String getScope() {
            return scope;
        }

        public void setScope(String scope) {
            this.scope = scope;
        }

        public List<String> getTypes() {
            return types;
        }

        public void setTypes(List<String> types) {
            this.types = types;
        }

        public String getVicinity() {
            return vicinity;
        }

        public void setVicinity(String vicinity) {
            this.vicinity = vicinity;
        }

        public OpeningHours getOpeningHours() {
            return openingHours;
        }

        public void setOpeningHours(OpeningHours openingHours) {
            this.openingHours = openingHours;
        }

        public List<Photo> getPhotos() {
            return photos;
        }

        public void setPhotos(List<Photo> photos) {
            this.photos = photos;
        }

        public Double getRating() {
            return rating;
        }

        public void setRating(Double rating) {
            this.rating = rating;
        }

        public Double getUserRatingsTotal() {
            return userRatingsTotal;
        }

        public void setUserRatingsTotal(Double userRatingsTotal) {
            this.userRatingsTotal = userRatingsTotal;
        }

        public Boolean getPermanentlyClosed() {
            return permanentlyClosed;
        }

        public void setPermanentlyClosed(Boolean permanentlyClosed) {
            this.permanentlyClosed = permanentlyClosed;
        }

        public Integer getPriceLevel() {
            return priceLevel;
        }

        public void setPriceLevel(Integer priceLevel) {
            this.priceLevel = priceLevel;
        }
    }

    public static class PlusCode {

        @SerializedName("compound_code")
        @Expose
        private String compoundCode;
        @SerializedName("global_code")
        @Expose
        private String globalCode;

        public String getCompoundCode() {
            return compoundCode;
        }

        public void setCompoundCode(String compoundCode) {
            this.compoundCode = compoundCode;
        }

        public String getGlobalCode() {
            return globalCode;
        }

        public void setGlobalCode(String globalCode) {
            this.globalCode = globalCode;
        }
    }

    public static class Photo {

        @SerializedName("height")
        @Expose
        private Integer height;
        @SerializedName("html_attributions")
        @Expose
        private List<String> htmlAttributions = null;
        @SerializedName("photo_reference")
        @Expose
        private String photoReference;
        @SerializedName("width")
        @Expose
        private Integer width;

        public Integer getHeight() {
            return height;
        }

        public void setHeight(Integer height) {
            this.height = height;
        }

        public List<String> getHtmlAttributions() {
            return htmlAttributions;
        }

        public void setHtmlAttributions(List<String> htmlAttributions) {
            this.htmlAttributions = htmlAttributions;
        }

        public String getPhotoReference() {
            return photoReference;
        }

        public void setPhotoReference(String photoReference) {
            this.photoReference = photoReference;
        }

        public Integer getWidth() {
            return width;
        }

        public void setWidth(Integer width) {
            this.width = width;
        }
    }

    public static class OpeningHours {

        @SerializedName("open_now")
        @Expose
        private Boolean openNow;

        public Boolean getOpenNow() {
            return openNow;
        }

        public void setOpenNow(Boolean openNow) {
            this.openNow = openNow;
        }
    }

    public static class Geometry {

        @SerializedName("location")
        @Expose
        private Location location;
        @SerializedName("viewport")
        @Expose
        private Viewport viewport;

        public Location getLocation() {
            return location;
        }

        public void setLocation(Location location) {
            this.location = location;
        }

        public Viewport getViewport() {
            return viewport;
        }

        public void setViewport(Viewport viewport) {
            this.viewport = viewport;
        }

    }

    public static class Viewport {

        @SerializedName("northeast")
        @Expose
        private Northeast northeast;
        @SerializedName("southwest")
        @Expose
        private Southwest southwest;

        public Northeast getNortheast() {
            return northeast;
        }

        public void setNortheast(Northeast northeast) {
            this.northeast = northeast;
        }

        public Southwest getSouthwest() {
            return southwest;
        }

        public void setSouthwest(Southwest southwest) {
            this.southwest = southwest;
        }

    }

    public static class Southwest {

        @SerializedName("lat")
        @Expose
        private Double lat;
        @SerializedName("lng")
        @Expose
        private Double lng;

        public Double getLat() {
            return lat;
        }

        public void setLat(Double lat) {
            this.lat = lat;
        }

        public Double getLng() {
            return lng;
        }

        public void setLng(Double lng) {
            this.lng = lng;
        }
    }

    public static class Northeast {

        @SerializedName("lat")
        @Expose
        private Double lat;
        @SerializedName("lng")
        @Expose
        private Double lng;

        public Double getLat() { return lat; }

        public void setLat(Double lat) { this.lat = lat; }

        public Double getLng() { return lng; }

        public void setLng(Double lng) { this.lng = lng; }

    }

    public static class Location {

        @SerializedName("lat")
        @Expose
        private Double lat;
        @SerializedName("lng")
        @Expose
        private Double lng;

        public Double getLat() { return lat; }

        public void setLat(Double lat) { this.lat = lat; }

        public Double getLng() { return lng; }

        public void setLng(Double lng) { this.lng = lng; }
    }
}
