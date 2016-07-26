Feature: Book Repository
  Scenario: Fetching the list of books
    * i call get "/books"

  Scenario: Two default books should always be returned
    When i call get "/books"
    Then the response status should be 200
    And response entity "_embedded.books" should contain at least 2 entities
    And the response should contain data:
    """
      _embedded.books:
        - title: Toi thay hoa vang tren co xanh
          author: Nguyen Nhat Anh
        - title: Ly thuyet sieu day
          author: Stephen Hawking
    """

  Scenario: A newly created book should be added to the list
    Given i call post "/books" with data
    """
      title: "Hoang Minh Thao biography"
      author: Myself
    """
    And the response status is 201
    When i call get "/books"
    Then the response entity "_embedded.books[]" should contain:
      | title  | Hoang Minh Thao biography  |
      | author | Myself                     |