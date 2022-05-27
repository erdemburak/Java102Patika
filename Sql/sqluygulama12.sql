/*
1 - film tablosunda film uzunluğu length sütununda gösterilmektedir. Uzunluğu ortalama film uzunluğundan fazla kaç tane film vardır?
2 - film tablosunda en yüksek rental_rate değerine sahip kaç tane film vardır?
3 - film tablosunda en düşük rental_rate ve en düşün replacement_cost değerlerine sahip filmleri sıralayınız.
4 - payment tablosunda en fazla sayıda alışveriş yapan müşterileri(customer) sıralayınız.
*/

1 - SELECT COUNT(title) from film
    WHERE length >
    (
    	SELECT AVG(length) from film
    );

2 - SELECT COUNT(title) FROM film
    WHERE rental_rate =
    (
        SELECT rental_rate FROM film
    	ORDER BY rental_rate DESC
    	LIMIT 1
    );

3 - SELECT * FROM film
    HERE rental_rate =
    (
    	SELECT rental_rate FROM film
    	ORDER BY rental_rate
    	LIMIT 1
    ) 
    AND replacement_cost =
    (
    	SELECT replacement_cost FROM film
    	ORDER BY replacement_cost
    	LIMIT 1
    );

4 - SELECT COUNT(payment_id),
    (SELECT first_name FROM customer 
     WHERE payment.customer_id=customer.customer_id) 
    FROM payment 
    GROUP BY customer_id
    ORDER BY COUNT(payment_id) DESC;