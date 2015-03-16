;creating a defstruct to hold restaurant data
(defstruct restaurant
  :name
  :phone
  :website
  :chef
  :location
  :priceLow
  :priceHigh
  :cuisine
  :atmosphere
  :alergies
  :rating
  :hours)

;creating a defstruct to hold customer preferences to compare against resturant
(defstruct customer
  :age                    ;age for age-restricted places such as bars
  :location
  :priceLow
  :priceHigh
  :cuisine
  :atmosphere
  :alergies
  :rating
  :hours)

;defining a varabale that is a restaurant struct
;using the struct-map for reability

;these can be accessed like the following:
;> (:location restaurantA)
;"Near North Side"
;> (:alergies restaurantC)
;"Dairy"

(def restaurantA (struct-map restaurant
  :name "MK Chicago"
  :phone "3124829179"
  :website "http://mkchicago.com/"
  :chef "Michael Kornick"
  :location "Near North Side"
  :priceLow "50"
  :priceHigh "120"
  :cuisine "French"
  :atmosphere "Classy"
  :alergies "Gluten"
  :rating "5"
  :hours "17:00-24:00"))

(def restaurantB (struct-map restaurant
  :name "DMK Burger Bar"
  :phone "7733608686"
  :website "http://dmkburgerbar.com/"
  :chef "Andrew van Buren"
  :location "Lincoln Park"
  :priceLow "10"
  :priceHigh "20"
  :cuisine "American Burgers"
  :atmosphere "Hip Bar"
  :alergies "Treenuts"
  :rating "4"
  :hours "17:00-24:00"))

(def restaurantC (struct-map restaurant
  :name "m.henry"
  :phone "7735611600"
  :website "http//mhenry.net/"
  :chef "Philip Gonzoles"
  :location "Andersonville"
  :priceLow "10"
  :priceHigh "18"
  :cuisine "American Brunch"
  :atmosphere "Casual"
  :alergies "Dairy"
  :rating "3.8"
  :hours "7:30-15:00"))
